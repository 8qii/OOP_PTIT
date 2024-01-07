import java.util.*;


public class J08028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[k+1];
        long[] b = new long[k+1];
        for(int i = 0 ; i < k ; i ++){
            a[i] = sc.nextLong();
            b[i] = n - a[i];
        }
        long maxi = 0;
        for(int i = 0 ; i < k ; i ++){
            int back = 0;
            int front = 0;
            int j = i - 1;
            while(j >= 0 && a[j] >= a[i]){ j--;back++;}
            j = i + 1;
            while(j < k && a[j] >= a[i]){ j++;front++;}
            maxi = Math.max(maxi,(back+front+1) * a[i]);

            int backb = 0;
            int frontb = 0;
            int jb = i - 1;
            while(jb >= 0 && b[jb] >= b[i]){ jb--;backb++;}
            jb = i + 1;
            while(jb < k && b[jb] >= b[i]){ jb++;frontb++;}
            maxi = Math.max(maxi,(backb+frontb+1) * b[i]);
        }
        System.out.println(maxi);
    }
}
