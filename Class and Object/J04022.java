import java.util.*;

class WordSet{
    TreeSet<String> set;


    public WordSet(String s){
        s = s.toLowerCase();
        this.set = new TreeSet<>();
        String[] tmp = s.split(" ");
        for(int i = 0 ; i < tmp.length ; i ++){
            set.add(tmp[i]);
        }
    }

    public String union(WordSet o){
        TreeSet<String> ss = new TreeSet<>();
        for(String x : set){
            ss.add(x);
        }
        for(String x : o.set){
            ss.add(x);
        }
        String res = "";
        for(String x : ss){
            res += x + " ";
        }
        return res;
    }

    public String intersection(WordSet o){
        TreeSet<String> ss = new TreeSet<>();
        TreeSet<String> r = new TreeSet<>();
        for(String x : set){

        }
        String res = "";
        for(String x : o.set){
            int a = ss.size();
            ss.add(x);
            if(a == ss.size()) r.add(x);
        }
        for(String x : r){
            res += x + " ";
        }
        return res;
    }

}

public class J04022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
    public static void main9446630(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
