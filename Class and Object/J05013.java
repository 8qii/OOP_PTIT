import java.util.*;

class TuyenDung{
    private String name , id;
    private float lt,th,tb;
    public static int num  = 1;

    public TuyenDung(String name , float lt , float th){
        this.name = name ;
        this.lt = lt;
        this.th = th;
        this.id = String.format("TS%02d" , num ++);
    }

    public float formatM(float k){
        if(k > 10)
            return (float)(k/10);
        return k;
    }

    public float getTb(){
        return (formatM(lt) + formatM(th)) / 2;
    }

    public String getXepLoai(){
        if(getTb() > 9.5) return "XUAT SAC";
        if(getTb() >= 8) return "DAT";
        if(getTb() >= 5) return "CAN NHAC";
        return "TRUOT";
    }

    @Override
    public String toString(){
        return id + " " + name + " " + String.format("%.2f" , getTb()) + " " + getXepLoai();
    }

}


public class J05013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<TuyenDung> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new TuyenDung(sc.nextLine() , Float.parseFloat(sc.nextLine()) , Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(l, new Comparator<TuyenDung>() {
            @Override
            public int compare(TuyenDung o1, TuyenDung o2) {
                if(o1.getTb() > o2.getTb()) return -1;
                return 1;
            }
        });
        for(TuyenDung i : l){
            System.out.println(i);
        }
    }
}
