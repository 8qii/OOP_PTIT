import java.util.Scanner;

public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int u = 1 ; u <= t ; u ++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] a = new int[n+1][m+1];
            int[][] b = new int[m+1][n+1];
            int[][] c = new int[n][n];

            for(int i = 0 ; i < n ; i ++){
                for(int j = 0 ; j < m ; j ++){
                    a[i][j] = sc.nextInt();
                }
            }

            for(int i = 0 ; i < m ; i ++){
                for(int j = 0 ; j < n ; j ++){
                    b[i][j] = a[j][i];
                }
            }

            for(int i = 0 ; i < n ; i ++){
                for(int j = 0 ; j < n ; j++){
                    for(int h = 0 ; h < m ; h ++){
                        c[i][j] += a[i][h] * b[h][j];
                    }
                }
            }

            System.out.println("Test " + u + ":");

            for(int i = 0 ; i < n ; i ++){
                for(int j = 0 ; j < n ; j ++){
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
