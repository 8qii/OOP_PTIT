import java.util.*;

public class J08023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0 ; i < n ; i ++){
                a[i] = sc.nextLong();
            }
            long max = 0;
            for(int i = 0 ; i < n ; i ++){
                long len = 1;
                int j = i - 1;
                while(j >= 0 && a[j] >= a[i]){
                    len++;
                    j--;
                    if(j < 0) break;
                }
                j = i + 1;
                while(j < n && a[j] >= a[i]){
                    len++;
                    j++;
                    if(j == n) break;
                }
                if(len * a[i] > max) max = len * a[i];
            }
            System.out.println(max);
        }
    }
}
