import java.util.Scanner;
public class J03040 {

    public static int dataType(String s){
        int a = Integer.parseInt(String.valueOf(s.charAt(5)));
        int b = Integer.parseInt(String.valueOf(s.charAt(6)));
        int c = Integer.parseInt(String.valueOf(s.charAt(7)));
        int d = Integer.parseInt(String.valueOf(s.charAt(9)));
        int e = Integer.parseInt(String.valueOf(s.charAt(10)));

        if(a + 1 == b && a + 2 == c && a + 3 == d && a + 4 == e){
            return 1;
        }

        if(a == b && b == c && c== d && d == e){
            return 2;
        }

        if(a == b && b == c && d == e){
            return 3;
        }

        if((a == 6  || a == 8) && (b == 6  || b == 8) && (c == 6  || c == 8) && (d == 6  || d == 8) && (e == 6  || e == 8)){
            return 4;
        }

        return 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(dataType(s) != 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
