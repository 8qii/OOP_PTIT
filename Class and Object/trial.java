import java.math.*;
import java.io.*;
import java.util.*;

public class trial{

    public static void Try(int j){
        if(j == n){
            for(int i = 0 ; i < n ; i ++){
                System.out.print(a[i]);
            }
            System.out.println();
            return;
        }
        for(int i = 1 ; i <= n ; i ++){
            if(!vs[i]){
                vs[i] = true;
                a[j] = i;
                Try(j+1);
                vs[i] = false;
            }
        }
    }

    public static int[] a = new int[10000];
    public static boolean[] vs = new boolean[10000];
    public static int n = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            for(int i = 0 ; i < n+1 ; i ++){
                vs[i] = false;
            }
            Try(0);
        }
    }
}