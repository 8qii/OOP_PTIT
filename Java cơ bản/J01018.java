import java.util.Scanner;

public class J01018 {

    public static boolean tong(long n){
        long sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        if(sum % 10 == 0) return true;
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long m = n;
            long prev = n % 10;
            n /= 10;
            boolean key = true;
            while(n > 0){
                long tmp = n % 10;
                n /= 10;
                if(Math.abs(tmp - prev) != 2){
                    key = false;
                    break;
                }
                prev = tmp;
            }
            if(key && tong(m)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
