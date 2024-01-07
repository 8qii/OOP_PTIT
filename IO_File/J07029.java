import java.io.*;
import java.util.*;

public class J07029 {

    public static boolean isPrime(int n){
        if( n < 2) return false;
        for(int i = 2 ; i <= Math.sqrt(n) ; i ++){
            if ( n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> l = (ArrayList<Integer>) sc.readObject();
        int[] a = new int[100000];
        for(Integer i : l){
            if(isPrime(i)) a[i]++;
        }
        int cnt = 10;
        for(int i = 1000000 ; i >= 2 ; i -- ){
            if(cnt == 0) break;
            if(a[i] != 0) {
                System.out.println(i + " " + a[i]);
                cnt--;
            }

        }
    }
}
