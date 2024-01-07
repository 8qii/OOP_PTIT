import java.math.BigInteger;
import java.util.Scanner;

public class J03011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = sc.nextBigInteger();
            System.out.println(a.gcd(b));
        }
    }
}