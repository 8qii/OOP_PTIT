import java.util.*;

public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<String> ss = new HashSet<String>();
        for(int i = 0 ; i < s.length() ; i ++){
            ss.add(String.valueOf(s.charAt(i)));
        }
        System.out.println(ss.size());
    }
}
