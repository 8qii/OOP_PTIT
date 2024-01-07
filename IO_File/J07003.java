import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class J07003 {

    public static void testCase(String s){
        int n = s.length();
        int dau = n / 2;
        BigInteger a = new BigInteger(s.substring(0,dau));
        BigInteger b = new BigInteger(s.substring(dau));
        BigInteger c = a.add(b);
        String res = c.toString();
        System.out.println(res);
        if(res.length() == 1) return;
        else testCase(res);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.next();
        testCase(s);
    }
}
