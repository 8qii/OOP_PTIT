import java.util.*;
import java.math.*;
public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = a.subtract(b).abs();
            String s = c.toString();
            int maxL = Math.max(a.toString().length(), b.toString().length());
            int bn = maxL - s.length();
            String g = "";
            for(int i = 0 ; i < bn ; i ++){
                g += "0";
            }
            System.out.println(g + s);
        }
    }
}
