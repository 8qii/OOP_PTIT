import java.util.*;

public class J08022 {

    public static void testCase(int[] a){
        Stack<Integer> st = new Stack<>();
        int[] dp = new int[a.length];
        for(int i = a.length - 1 ; i >= 0 ; i --){
            while(!st.empty() && a[i] >= a[st.peek()]) st.pop();
            if(st.empty()) dp[i] = -1;
            else
                dp[i] = a[st.peek()];
            st.push(i);

        }
        for(int i = 0; i < a.length; i++){
            System.out.print(dp[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0 ; i < n ; i ++){
                a[i] = sc.nextInt();
            }
            testCase(a);
        }
    }
}
