import java.util.*;

public class J02028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n+1];
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
                a[i] += a[i - 1];
            }
            boolean check = false;
            for(int i = 0; i < n; i++){
                if(Arrays.binarySearch(a, i + 1, n + 1, a[i] + k) >= 0){
                    check = true;
                    break;
                }
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}