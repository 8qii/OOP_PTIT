import java.util.Scanner;

public class J01010{

    static Scanner sc = new Scanner(System.in);

    public static long solve(String n){
        int k = n.length();
        long res = 0;
        for(int i = 0 ; i < k ; i ++){
            if(n.charAt(i) == '8' || n.charAt(i) == '9' || n.charAt(i) == '0') res = res * 10 ;
            else if(n.charAt(i) == '1') res = res * 10 + 1;
            else return 404l;
        }
        return res;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            String  n = sc.next();
            if(solve(n) == 404) System.out.println("INVALID");
            else if (solve(n) == 0) System.out.println("INVALID");
            else System.out.println(solve(n));
        }
    }
}