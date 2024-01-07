import java.util.Scanner;
public class J01009 {
    static long[] f = new long[25];

    public static void pre(){
        f[1] = 1;
        for(int i = 2 ; i <= 20 ; i ++){
            f[i] = f[i-1] * i;
        }
    }

    public static void main(String[] args) {
        pre();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i = 1 ; i <= n ; i ++){
            sum += f[i];
        }
        System.out.print(sum);
    }
}
