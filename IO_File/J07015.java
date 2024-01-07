import java.util.*;
import java.io.*;

public class J07015 {

    public static boolean isPrime(int n){
        if( n < 2) return false;
        for(int i = 2 ; i <= Math.sqrt(n) ; i ++){
            if ( n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException ,ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> l = (ArrayList<Integer>) sc.readObject();
        int[] a = new int[100000];
        for(Integer i : l){
            if(isPrime(i)){
                a[i] ++;
            }
        }
        for(int i = 0 ; i < 100000 ; i ++){
            if(a[i] != 0) System.out.println(i + " "+ a[i]);
        }
    }
}
