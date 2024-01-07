import java.util.*;

class Bxh_5042 implements Comparable<Bxh_5042>{
    private String name;
    private int num,sub;

    public Bxh_5042(String name , int num , int sub){
        this.name = name;
        this.num = num;
        this.sub = sub;
    }

    @Override
    public int compareTo(Bxh_5042 a) {
        if(a.num == num) return sub - a.sub;
        return a.num - num;
    }

    @Override
    public String toString(){
        return name + " " + num + " " + sub;
    }
}


public class J05042 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Bxh_5042> l = new ArrayList<>();
        int t = sc.nextInt();
        while(t-- > 0){
            sc.nextLine();
            l.add(new Bxh_5042(sc.nextLine() ,sc.nextInt() , sc.nextInt()));
        }
        Collections.sort(l);
        for(Bxh_5042 i : l){
            System.out.println(i);
        }
    }

}
