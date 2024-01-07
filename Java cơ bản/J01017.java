import java.util.Scanner;

public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long prev = n % 10;
            n /= 10;
            boolean key = true;
            while(n > 0){
                long tmp = n % 10;
                n /= 10;
                if(Math.abs(tmp - prev) != 1){
                    key = false;
                    break;
                }
                prev = tmp;
            }
            if(key) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
