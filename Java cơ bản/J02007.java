import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 1 ; j <= t ; j ++){
            int n = sc.nextInt();
            int[] a = new int[n + 5];
            int[] m = new int[10001];
            for(int i = 0 ; i < n ; i ++){
                a[i] = sc.nextInt();
                m[a[i]] ++;
            }
            System.out.println("Test " + j + ":");
            for(int i = 0 ; i < n ; i ++){
                if(m[a[i]] > 0) {
                    System.out.println(a[i] + " xuat hien " + m[a[i]] + " lan");
                    m[a[i]] = 0;
                }
            }
        }
    }
}
