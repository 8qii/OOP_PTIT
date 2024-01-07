import java.util.*;

public class J02102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n * n];
        for(int i = 0 ; i < n * n ; i ++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[][] f = new int[n][n];
        int h1 = 0 , h2 = n - 1 , c1 = 0 , c2 = n - 1;
        int num = 0 ;
        while(num < n * n){
            for(int i = c1 ; i <= c2 ; i ++) f[h1][i] = a[num++];
            h1++;
            for(int i = h1 ; i <= h2 ; i ++) f[i][c2] = a[num++];
            c2--;
            for(int i = c2 ; i >= c1 ; i --) f[h2][i] = a[num++];
            h2--;
            for(int i = h2 ; i >= h1 ; i --) f[i][c1] = a[num++];
            c1++;
        }
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                System.out.print(f[i][j] + " ");
            }
            System.out.println();
        }
    }
}
