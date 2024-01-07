import java.util.*;


public class J03031 {
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int[] a = new int[26];
            String s = sc.next();
            int k = sc.nextInt();
            for(int i = 0 ; i < s.length() ; i ++){
                a[(int)s.charAt(i) - 97] ++;
            }
            int cnt = 0;
            for(int i = 0 ; i <= 25 ; i ++){
                if(a[i] == 0) cnt ++;
            }
            if(cnt <= k) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
