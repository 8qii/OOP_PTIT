import java.util.*;
import java.io.*;

public class J07076 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t-- > 0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[][] a = new int[m][n];
            int[] b = new int[m];
            for(int i = 0 ; i < m ; i ++){
                for(int j = 0 ; j < n ; j ++){
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i = 0 ; i < m ; i ++){
                b[i] = a[i][k - 1];
            }
            Arrays.sort(b);
            for(int i = 0 ; i < m ; i ++){
                a[i][k - 1] = b[i];
            }
            for(int i = 0 ; i < m ; i ++){
                for(int j = 0 ; j < n ; j ++){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
