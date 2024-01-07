import java.util.Scanner;

public class J08026 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > b) {
                System.out.println(a - b);
            }
            else{
                int[] dp = new int[b + 1];
                for(int i = 1 ; i <= a ; i ++){
                    dp[i] = a - i;
                }
                for(int i = a + 1 ; i <= b ; i ++){
                    if(i % 2 == 0){
                        dp[i] = Math.min(dp[i/2] + 1, dp[i/2 + 1] + 2);
                    }
                    else{
                        dp[i] = dp[(i+1)/2] + 2;
                    }
                }
                System.out.println(dp[b]);
            }
        }
    }

}
