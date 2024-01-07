import java.util.*;

public class J03028 {

    static String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String k = sc.next();
            String a = k.substring(0 , k.length() / 2);
            String b = k.substring(k.length() / 2);
            int suma = 0;
            int sumb = 0;
            for(int i = 0 ; i < a.length() ; i ++) {
                suma += ((int) a.charAt(i) - 65);
                sumb += ((int) b.charAt(i) - 65);
            }
            String resa = "";
            String resb = "";
            for(int i = 0 ; i < a.length() ; i ++){
                int x = (int)a.charAt(i) + suma;
                while(x > 90) x -= 26;
                resa += (char)x;

                int y = (int)b.charAt(i) + sumb;
                while(y > 90) y -= 26;
                resb += (char)y;

            }
            String res = "";
            for(int i = 0 ; i < a.length() ; i ++){
                int tmp = (int)resb.charAt(i) - 65;

                int x = (int)resa.charAt(i) + tmp;
                while(x > 90) x -= 26;
                res += (char)x;
            }
            System.out.println(res);
        }
    }
}
