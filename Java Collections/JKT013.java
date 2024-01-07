import java.util.*;

public class JKT013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            List<Long> res = new ArrayList<>();
            int n = sc.nextInt();
            Queue<Long> q = new LinkedList<>();
            q.add(6l);
            q.add(8l);
            while(true){
                Long s = q.poll();
                String ss = s + "";
                if(ss.length() > n) break;
                res.add(s);
                q.add(s * 10 + 6);
                q.add(s * 10 + 8);
            }
            System.out.println(res.size());
            for(int i = res.size() - 1 ; i >= 0 ; i --){
                System.out.print(res.get(i) + " ");
            }
            System.out.println();
        }
    }
}
