import java.util.*;

public class J02022 {


    static int[] a = new int[15];
    static int[] vs = new int[15];
    static int n = 0;

    static void check(){
        for(int i = 0 ; i < n - 1; i ++){
            if(Math.abs(a[i] - a[i+1]) == 1) return;
        }
        for(int i = 0 ; i < n ; i ++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static void gen(int j){
        if(j == n) {
            check();
            return;
        }
        for(int i = 1 ; i <= n ; i ++){
            if(vs[i] == 0){
                vs[i] = 1;
                a[j] = i;
                gen(j+1);
                vs[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            for(int i = 0 ; i <= n + 1 ; i ++){
                vs[i] = 0 ;
            }
        gen(0);
        }
    }
}
