import java.util.Scanner;

public class J01011 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            long n , k ;
            n = sc.nextLong();
            k = sc.nextLong();
            long c = n * k;
            while(n != k){
                if(n > k) n -= k;
                else k -= n;
            }
            System.out.println(((c / n) + " " + n));
        }
    }
}
