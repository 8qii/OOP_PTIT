import java.util.*;

public class J03021 {

    public static boolean tn(String s){
        for(int i = 0 ; i < s.length() / 2 ; i ++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        int[] a = new int [10];
        a[2] = 64;
        a[3] = 67;
        a[4] = 70;
        a[5] = 73;
        a[6] = 76;
        a[7] = 79;
        a[8] = 83;
        a[9] = 86;

        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            s = s.toUpperCase();
            String res = "";
            for(int i = 0 ; i < s.length() ; i ++){
                int k = s.codePointAt(i);
                for(int j = 9 ; j >= 2 ; j --){
                    if(k > a[j]){
                        res += String.valueOf(j);
                        break;
                    }
                }
            }
            if(tn(res)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
