import java.util.Scanner;
public class J03024 {

    public static boolean isValid(String s){
        if(s.charAt(0) == '0') return false;

        for(int i = 0 ; i < s.length() ; i ++){
            if(s.codePointAt(i) < 48 || s.codePointAt(i) > 57) return false;
        }
        return true;
    }

    public static int NumIsOdd(String s){
        if(s.length() % 2 == 0) return 0;
        return 1;
    }

    public static int SumIsOdd(String s){
        int cnt = 0;
        for(int i = 0 ; i < s.length() ; i ++){
            if(Integer.parseInt(String.valueOf(s.charAt(i))) % 2 == 0) cnt --;
            else cnt++;
        }
        if(cnt > 0) return 1;
        if(cnt == 0) return 2;
        return 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(!isValid(s)){
                System.out.println("INVALID");
            }
            else {
                if(SumIsOdd(s) == NumIsOdd(s)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
