import java.util.*;
//0 1 01 101 01101
//1 1 2 3 5
//5 4 | 4 2 | 3 1| 1 1
public class J01022 {

    static long[] f = new long[92];
    public static void main(String[] args) {

        f[1] = 1;
        f[2] = 1;
        for(int i = 3 ; i < 92 ; i ++){
            f[i] = f[i-1] + f[i-2];
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(dev(n,k));
        }
    }
    public static char dev(int n, long k) {
        if (n == 1) {
            return '0';
        }
        if (n == 2) {
            return '1';
        }
        if (k <= f[n - 2]) {
            return dev(n - 2, k);
        }
        return dev(n - 1, k - f[n - 2]);
    }
}
