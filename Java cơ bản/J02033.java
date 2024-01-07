import java.util.*;

public class J02033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        long[] a = new long[n];
        PriorityQueue <Long> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
            pq.add(a[i]);
        }
        long ans = 0;
        while(k-- > 0){
            long top = pq.poll();
            pq.add(-top);
        }
        while(!pq.isEmpty()){
            ans += pq.poll();
        }
        System.out.println(ans);
    }
}