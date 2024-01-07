import java.util.*;

class dntt implements Comparable<dntt>{

    private String id,name;
    private int sl;

    public dntt(String id , String name , int sl){
        this.id = id;
        this.name = name;
        this.sl = sl;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + sl;
    }

    @Override
    public int compareTo(dntt a){
        if(this.sl == a.sl){
            return id.compareTo(a.id);
        }
        return a.sl - sl;
    }

}


public class J05028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<dntt> l = new ArrayList<>();
        while(t-- > 0){
            dntt a = new dntt(sc.nextLine() , sc.nextLine() , Integer.parseInt(sc.nextLine()));
            l.add(a);
        }
        Collections.sort(l);
        for(dntt i : l){
            System.out.println(i);
        }
    }
}
