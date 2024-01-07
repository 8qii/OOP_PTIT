import java.util.Scanner;
public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int j = 1 ; j <= t ; j ++){
            int n = sc.nextInt();
            System.out.print("Test " + j + ": ");
            int m = n;
            for(int i = 2 ; i <= n ; i ++){
                int count = 0;
                while(n % i == 0){
                    count ++;
                    n /= i;
                }
                if(count > 0) System.out.printf("%d(%d) ", i, count);
            }
            System.out.println();
        }
    }
}
