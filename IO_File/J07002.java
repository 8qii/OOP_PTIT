import java.io.*;
import java.util.*;


public class J07002 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()){
            try{
                sum += Integer.parseInt(sc.next());
            } catch (Exception e){

            }
        }
        System.out.println(sum);
    }
}
