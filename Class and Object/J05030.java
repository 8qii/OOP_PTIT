import java.util.*;

class stu implements Comparable<stu>{
    private String id , name , lop ;
    private float d1,d2,d3;

    public stu(String id , String name , String lop , float d1 , float d2 , float d3){
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public String toString(){
        return " " + id + " " + name + " " + lop + " " + String.format("%.1f",d1) + " " + String.format("%.1f",d2) + " " + String.format("%.1f",d3);
    }

    @Override
    public int compareTo(stu a){
        return id.compareTo(a.id);
    }

}

public class J05030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<stu> l = new ArrayList<>();
        while(t-- > 0){
            stu a = new stu(sc.nextLine() , sc.nextLine() , sc.nextLine() , Float.parseFloat(sc.nextLine()) , Float.parseFloat(sc.nextLine()) , Float.parseFloat(sc.nextLine()));
            l.add(a);
        }
        Collections.sort(l);
        int cnt = 1;
        for(stu i : l){
            System.out.print(cnt++);
            System.out.println(i);
        }
    }
}
