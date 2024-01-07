import static java.lang.Math.pow;
import java.util.Scanner;

public class J01021 {

    static final int mod = (int) (1e9 + 7);
    public static long bigPow(long a , long b){
        if ( b == 1) return a % mod;
        if ( b == 0) return 1;

        long x = bigPow(a , b / 2);
        long y = (x * x) % mod;
        if(b % 2 == 0) return y % mod;
        return (y * a) % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) break;
            System.out.println(bigPow(a,b));
        }
    }
}
