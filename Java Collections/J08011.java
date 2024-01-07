import java.util.*;

class pair{
    private Integer fi,se;

    public pair(Integer fi , Integer se){
        this.fi = fi;
        this.se = se;
    }

    public Integer getFi() {
        return fi;
    }

    public Integer getSe(){
        return se;
    }

    public void setSe(Integer se) {
        this.se = se;
    }

    @Override
    public String toString(){
        return fi + " " + se;
    }

}


public class J08011 {

    public static boolean check(int n){
        int r = n % 10;
        n /= 10;
        while(n > 0){
            if(r < n % 10)
                return false;
            r = n % 10;
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<pair> l = new ArrayList<>();
        while(sc.hasNext()){
            int s = sc.nextInt();
            if(check(s)){
                boolean contains = false;
                for(pair i : l){
                    if(i.getFi() == s){
                        contains = true;
                        i.setSe(i.getSe() + 1);
                        break;
                    }
                }
                if(contains == false) l.add(new pair(s,1));
            }
        }
        Collections.sort(l, new Comparator<pair>() {
            @Override
            public int compare(pair o1, pair o2) {
                return (int)(o2.getSe() - o1.getSe());
            }
        });
        for(pair i : l){
            System.out.println(i);
        }
    }
}
