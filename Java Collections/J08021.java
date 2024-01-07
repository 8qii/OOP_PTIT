import java.util.*;

public class J08021 {

    public static int check(String s){
        int maxLen = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i = 0 ; i < s.length() ; i ++){
            if(s.charAt(i) == '(') st.push(i);
            else {
                st.pop();
                if(!st.empty()){
                    maxLen = Math.max(maxLen , i - st.peek());
                }
                else{
                    st.push(i);
                }
            }
        }
        return maxLen;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s =  sc.next();
            System.out.println(check(s));
        }
    }
}
