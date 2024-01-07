import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;


public class J02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for(int i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();
        }
        List<Integer> ss = new ArrayList<>();
        for(int i = 0 ; i < n ; i  ++){
            ss.add(a[i]);
            System.out.print("Buoc " + i + ": ");
            Collections.sort(ss);
            for(int j : ss){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
