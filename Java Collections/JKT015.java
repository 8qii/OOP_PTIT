import java.util.*;

public class JKT015 {

    public static String TestCase(String s){
        Stack<Character> st = new Stack<>() , tmp = new Stack<>();
        for(int i = 0 ; i < s.length() ; i ++){
            if(s.charAt(i) == '<'){
                if(st.empty()) continue;
                Character c = st.peek();
                st.pop();
                tmp.add(c);
            }
            else if(s.charAt(i) == '>'){
                if(tmp.empty()) continue;
                Character c = tmp.peek();
                tmp.pop();
                st.add(c);
            }

            else if(s.charAt(i) == '-'){
                if(st.empty()) continue;
                st.pop();
            }
            else{
                st.add(s.charAt(i));
            }
        }
        while(!tmp.empty()){
            Character c = tmp.peek();
            tmp.pop();
            st.add(c);
        }
        StringBuilder ss = new StringBuilder();
        while(!st.empty()){
            Character c = st.peek();
            st.pop();
            ss.append(c);
        }
        ss = ss.reverse();
        String res = ss.toString();
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(TestCase(s));
    }
}
