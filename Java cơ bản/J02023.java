import java.util.Scanner;
public class J02023 {
    public static void be(int n, int s){
        if (s == 0 || s > 9 * n) {
            System.out.printf("-1 ");
            return;
        }
        int[] a = new int[n];
        s = s - 1;
        for(int i = n - 1; i > 0; i--){
            if(s >= 9){
                a[i] = 9;
                s -= 9;
            }
            else{
                a[i] = s;
                s = 0;
            }
        }
        a[0] = 1 + s;
        for(int i : a){
            System.out.print(i);
        }
        System.out.printf(" ");
    }
    public static void lon(int n, int s){
        if (s == 0 || s > 9 * n) {
            System.out.println("-1");
            return;
        }
        int[] a = new int [n];
        for(int i = 0; i < n; i++){
            if(s >= 9){
                a[i] = 9;
                s -= 9;
            }
            else {
                a[i] = s;
                s = 0;
            }
        }
        for(int i : a){
            System.out.print(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        be(n, s);
        lon(n, s);
    }
}