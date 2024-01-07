import java.lang.reflect.Array;
import java.util.*;

public class J02024 {
    static List<String> l = new ArrayList<>();

    static int[] a = new int[20];
    static int[] b = new int[20];

    static int n = 0;

    public static void gen(int j){
        if(j == n){
            check();
            return;
        }
        for(int i = 0 ; i <= 1 ; i ++){
            b[j] = i;
            gen(j + 1);
        }
    }

    public static void check(){
        int sum = 0;
        for(int i = 0 ; i < n ; i ++){
            sum += a[i] * b[i];
        }
        if(sum % 2 == 1){
            String res = "";
            for(int i = n-1 ; i >= 0 ; i --){
                if(b[i] == 1) res += a[i] + " ";
            }
            l.add(res);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            l.clear();
            n = sc.nextInt();
            for(int i = 0 ; i < n ; i ++){
                a[i] = sc.nextInt();
            }
            for(int i = 0 ; i < n - 1 ; i ++){
                for(int j = i + 1 ; j < n ; j ++){
                    if(a[i] > a[j]){
                        int tmp = a[i];
                        a[i] = a[j];
                        a[j] = a[i];
                    }
                }
            }
            gen(0);
            Collections.sort(l);
            for(String i : l){
                System.out.println(i);
            }
        }
    }
}
