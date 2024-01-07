import java.util.*;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            Set<String> s = new TreeSet<String>();
            Set<String> res = new TreeSet<String>();
            String a = sc.nextLine();
            String b = sc.nextLine();
            String[] tmp = b.split(" ");
            for(int i = 0 ; i < tmp.length ; i ++){
                s.add(tmp[i]);
            }
            String[] tmpp = a.split(" ");
            for(int i = 0 ; i < tmpp.length ; i ++){
                int k = s.size();
                s.add(tmpp[i]);
                if(s.size() > k) res.add(tmpp[i]);
            }
            for(String i : res){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
