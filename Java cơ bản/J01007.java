import java.util.Scanner;
public class J01007 {

    public static long[] f = new long[101];

    public static Scanner sc  = new Scanner(System.in);

    public static void pre(){
        f[1] = 1l;
        f[2] = 1l;

        for(int i = 3 ; i < 101 ; i ++){
            f[i] = f[i-1] + f[i-2];
        }
    }

    public static boolean fibo(long n){
        for (long i : f) {
            if (i == n) {
                return true;
            } else if (i > n) {
                return false;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        pre();

        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if(fibo(n)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
