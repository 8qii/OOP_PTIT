import java.util.Scanner;

public class J03008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int n = s.length();
            boolean key = true;
            for(int i = 0 ; i < n ; i ++){
                int k = Integer.parseInt(String.valueOf(s.charAt(i)));
                if(k != 2 && k != 3 && k != 5 && k != 7) key = false;
                if(s.charAt(i) != s.charAt(n -  i - 1)) key = false;
            }
            if(key) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
