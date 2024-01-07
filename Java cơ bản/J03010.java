import java.util.*;

public class J03010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> k = new HashSet<String>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < n ; i ++){
            String s = sc.nextLine();
            s = s.trim().toLowerCase();
            s = s.replaceAll("\\s+" , " ");
            String[] tmp = s.split(" ");
            String res = tmp[tmp.length - 1];
            for(int j = 0 ; j < tmp.length - 1 ; j ++){
                res += tmp[j].charAt(0);
            }
            int m = k.size();
            k.add(res);
            if(m == k.size()){
                String o = null;
                for(int j = 2 ;j < 100 ; j ++){
                    o = res + j;
                    k.add(o);
                    if(k.size() > m) break;
                }
                res = o;
            }
            System.out.println(res + "@ptit.edu.vn");
        }

    }
}
