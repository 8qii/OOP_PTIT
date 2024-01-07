import java.util.*;

public class J03037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s  = sc.next();
        int[] vs = new int[300];
        int l1 = 0 , l2 = 0 , cnt =0;
        while(l1 < s.length()){
            if(vs[(int)s.charAt(l1)] == 0){
                Set<Character> ss = new HashSet<>();
                l2 = l1 + 1;
                int d = 0;
                while(s.charAt(l2) != s.charAt(l1)){
                    ss.add(s.charAt(l2));
                    l2++;
                    d++;
                }
                cnt += (2*ss.size() - d);
                vs[(int)s.charAt(l1)] = 1;
            }
            l1++;
        }
        System.out.println(cnt / 2);
    }
}
