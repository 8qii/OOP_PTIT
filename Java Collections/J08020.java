import java.util.*;

public class J08020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            Stack<Character> ss = new Stack<>();
            for(int i = 0 ; i < s.length() ; i ++){
                if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                    ss.add(s.charAt(i));
                }
                else if(s.charAt(i) == ')'){
                    if(ss.empty() == false && ss.peek() == '(') ss.pop();
                    else ss.add(s.charAt(i));
                }
                else if(s.charAt(i) == '}'){
                    if(ss.empty() == false && ss.peek() == '{') ss.pop();
                    else ss.add(s.charAt(i));
                }
                else if(s.charAt(i) == ']'){
                    if(ss.empty() == false && ss.peek() == '[') ss.pop();
                    else  ss.add(s.charAt(i));
                }
            }
            if(ss.empty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
