import java.util.*;

class DonHang2 implements Comparable<DonHang2>{
    private String name , id , stt;
    private int gia , sl ;

    public DonHang2(String name , String id , int gia , int sl){
        this.name = name;
        this.id = id;
        this.gia = gia;
        this.sl = sl;
        this.stt = id.substring(1,4);
    }

    public int getInc(){
        String s = String.valueOf(id.charAt(4));
        if(s.equals("1")) return (int)(0.5 * gia * sl);
        return (int)(0.3 * gia * sl);
    }
    public int getTT(){
        return gia * sl - getInc();
    }

    @Override
    public String toString(){
        return name + " " + id + " " + stt + " " + getInc() + " " + getTT();
    }

    @Override
    public int compareTo(DonHang2 o) {
        return stt.compareTo(o.stt);
    }
}


public class J05053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<DonHang2> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new DonHang2(sc.nextLine() , sc.nextLine() , Integer.parseInt(sc.nextLine()) , Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(l);
        for(DonHang2 i : l){
            System.out.println(i);
        }
    }
}
