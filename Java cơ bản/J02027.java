import java.util.*;

public class J02027 {

    public static int findPos(int[] a , int k){
        int res = -1 , l = 0 , r = a.length - 1;
        while(l <= r){
            int m = (l + r) / 2;
            if(a[m] < k){
                res = m;
                l = m + 1;
            }
            else r = m - 1;
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt() , k = sc.nextInt();
            int[] a = new int[n];
            for(int i  = 0 ; i < n ; i ++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            long cnt = 0;
            for(int i = 0 ; i < n ; i ++){
                int pos = findPos(a ,k + a[i]);
                if(pos != -1){
                    cnt += (pos - i)* 1l;
                }
            }
            System.out.println(cnt);
        }
    }
}
