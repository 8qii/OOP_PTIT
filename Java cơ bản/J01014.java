import java.util.*;
import java.math.*;

public class J01014 {
    public static long maxPrime(long n){
        long ans = 2;
        while(n % 2 == 0){
            n /= 2;
        }
        for (int i = 3 ; i < Math.sqrt(n) ; i += 2){
            if(n % i == 0){
                while(n % i == 0){
                    n /= i;
                    ans = i;
                }
            }
        }
        if(n > 2) ans = n;
        return ans;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            System.out.println(maxPrime(n));
        }
    }
}
