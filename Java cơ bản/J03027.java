import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class J03027 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> l = new ArrayList<String>();
        String s = sc.next();
        for(int i = 0 ; i < s.length() ; i ++){
            l.add(String.valueOf(s.charAt(i)));
        }

        while(true){
            int k = 0;
            for(int i = 0 ; i < l.size() - 1 ; i ++){
                if(l.size() <= 1) break;
                if(l.get(i).equals(l.get(i+1))){
                    l.remove(i+1);
                    l.remove(i);
                    k = 1;
                }
            }
            if(k == 0) break;
        }
        if(l.size() == 0) System.out.println("Empty String");
        else
            for(int i = 0 ; i < l.size() ; i ++){
                System.out.print(l.get(i));
            }
    }
}
