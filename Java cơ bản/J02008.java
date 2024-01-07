import java.util.Scanner;

public class J02008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long prod = 1;
            for(int i = 2 ; i <= n ; i ++){
                long k = prod;
                long l = i;
                while( l != 0 ){
                    long x = k % l;
                    k = l;
                    l = x;
                }
                prod = (prod * i ) / k;
            }
            System.out.println(prod);
        }
    }
}
