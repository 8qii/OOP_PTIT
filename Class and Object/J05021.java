import java.util.*;

class dssv2 implements Comparable<dssv2>{
    private String id, name, lop, mail ;

    public dssv2(String id , String name , String lop , String mail){
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.mail = mail;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + lop + " " + mail;
    }

    @Override
    public int compareTo(dssv2 a){
        return id.compareTo(a.id);
    }

}

public class J05021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<dssv2> l = new ArrayList<>();
        while(sc.hasNext()){
            dssv2 a = new dssv2(sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine());
            l.add(a);
        }
        Collections.sort(l);
        for(dssv2 i : l){
            System.out.println(i);
        }
    }
}
