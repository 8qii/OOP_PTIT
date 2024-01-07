import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class J02017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> l = new ArrayList<Integer>();
        for(int i = 0 ; i < n ; i ++){
            l.add(sc.nextInt());
        }

        while(true){
            int k = 0;
            for(int i = 0 ; i < l.size() - 1 ; i ++){
                if(l.size() <= 1) break;
                if((l.get(i) + l.get(i+1)) % 2 == 0){
                    l.remove(i+1);
                    l.remove(i);
                    k = 1;
                }
            }
            if(k == 0) break;
        }

        System.out.println(l.size());
    }
}
