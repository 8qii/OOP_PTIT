import java.util.Scanner;

public class J03006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int n = s.length();
            boolean key = true;
            for(int i = 0 ; i < n ; i ++){
                if(s.charAt(i) != s.charAt(n -  i - 1) || Integer.parseInt(String.valueOf(s.charAt(i))) % 2 == 1){
                    key = false;
                    break;
                }
            }
            if(key) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
