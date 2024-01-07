import java.util.Scanner;

import static java.lang.Math.sqrt;

public class J01004 {

    public static boolean snt(int n){
        if(n < 2) return false;
        for(int i = 2 ; i <= sqrt(n) ; i ++){
            if(n % i == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {

        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while(t > 0){
            int n = sc.nextInt();
            if(snt(n) == true) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
