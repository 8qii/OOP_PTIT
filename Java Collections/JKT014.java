import java.util.Scanner;
import java.util.Stack;


public class JKT014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-- > 0){
            int n  = sc.nextInt();
            int[] a = new int[n];
            Stack<Integer> st = new Stack<>();
            for(int i = 0 ; i < n ; i ++){
                a[i] = sc.nextInt();
            }
            int[] dp = new int[n];
            for(int i = 0 ; i < n ; i ++){
                if(!st.empty()){
                    while (!st.empty() && a[i] >= a[st.peek()]) {
                        st.pop();
                    }
                }


                if(st.empty()){
                    dp[i] = i + 1;
                    st.add(i);
                }
                else {
                    dp[i] = i - st.peek();
                    st.add(i);
                }
            }
            for(int i = 0 ; i < n ; i ++){
                System.out.print(dp[i] +  " ");
            }
            System.out.println();
        }
    }
}
