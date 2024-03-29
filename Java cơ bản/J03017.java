import java.util.*;

public class J03017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            char[] c = s.toCharArray();
            int len = 0, ans = 0;
            Stack <Character> st = new Stack <>();
            for(int i = c.length - 1; i >= 0; i--){
                if(c[i] == '1'){
                    if(st.size() > 1){
                        len += 3;
                        st.pop(); st.pop();
                    }
                    else{
                        st.clear();
                        len = 0;
                    }
                    ans = Math.max(len, ans);
                }
                else{
                    st.add('0');
                    if(st.size() > 2)
                        len = 0;
                }
            }
            System.out.println(ans);
        }
    }
}