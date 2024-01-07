import java.util.Scanner;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] mark = new int[1001];

        for(int i = 0 ; i < n ; i ++){
            int a = sc.nextInt();
            if(mark[a] == 0) mark[a] ++;
        }

        for(int i = 0 ; i < k ; i ++){
            int a = sc.nextInt();
            if(mark[a] == 1) mark[a] ++;
        }
        for(int i = 0 ; i < 1001 ; i ++){
            if(mark[i] == 2) System.out.print(i + " ");
        }
    }
}
