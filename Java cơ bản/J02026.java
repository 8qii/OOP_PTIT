import java.util.*;
public class J02026 {

    static int n,k;
    static int[] a = new int[20];
    static int[] b = new int[20];

    static void gen(){
        for(int i = 1 ; i <= k ; i ++){
            a[i] = i;
        }

        while(true){
            check();
            int i = k;
            while(i > 0 && a[i] == n - k + i) i--;
            if(i <= 0) return;
            a[i] ++;
            for(int j = i + 1 ; j <= k ; j ++){
                a[j] = a[i] + j - i;
            }
        }
    }

    static void check(){
        for(int i = 1 ; i <= k ; i ++){
            System.out.print(b[a[i]] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            k = sc.nextInt();
            for(int i = 1; i <= n ; i ++){
                b[i] = sc.nextInt();
            }
            Arrays.sort(b,1,n+1);
            gen();
        }
    }
}
