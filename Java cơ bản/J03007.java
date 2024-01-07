import java.util.Scanner;

public class J03007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int n = s.length();
            boolean key = true;
            if(s.charAt(0) != '8' || s.charAt(n-1) != '8') key = false;
            int sum = 0;
            for(int i = 0 ; i < n ; i ++){
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            if(sum % 10 != 0) key = false;
            if(key) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
