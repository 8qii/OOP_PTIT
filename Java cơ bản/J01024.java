import java.util.Scanner ;

public class J01024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            boolean flag = true;
            for(int i = 0 ; i < s.length() ; i ++){
                if(s.charAt(i) != '1' && s.charAt(i) != '0' && s.charAt(i) != '2') flag = false;
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
