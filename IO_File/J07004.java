import java.util.*;
import java.io.*;


public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File("DATA.in"));
        int[] a = new int[1000];
        while(sc.hasNext()){
            a[Integer.parseInt(sc.next())] ++;
        }
        for(int i = 0 ; i < 1000 ; i ++){
            if(a[i] > 0) System.out.println(i + " " + a[i]);
        }
    }
}
