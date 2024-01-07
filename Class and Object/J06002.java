import java.util.*;

class sp2{
    private String id, name;
    private int l1, l2;
    public sp2(String id, String name, int l1, int l2){
        this.id = id;
        this.name = name;
        this.l1 = l1;
        this.l2 = l2;
    }

    public int getGia(int n) {
        if(n == 1) return l1;
        return l2;
    }


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

class dh2 implements Comparable<dh2>{
    private String id, name;
    private int sl, gia;
    public static int num = 1;

    public dh2(String id, String name, int sl, int gia){
        this.sl = sl;
        this.id = id + String.format("-%03d", num++);
        this.name = name;
        this.gia = gia;
    }

    public int getThanhTien(){
        return sl * gia;
    }

    public int getDiscount(){
        if(sl >= 150) return (int)(0.5 * getThanhTien());
        if(sl >= 100) return (int)(0.3 * getThanhTien());
        if(sl >= 50) return (int)(0.15 * getThanhTien());
        return 0;
    }

    public int getTra() {
        return (getThanhTien() - getDiscount());
    }

    public String toString(){
        return id + " " + name + " " + getDiscount() + " " + (getThanhTien() - getDiscount());
    }

    @Override
    public int compareTo(dh2 o) {
        return o.getTra() - this.getTra();
    }
}


public class J06002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<sp2> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new sp2(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        t = Integer.parseInt(sc.nextLine());
        ArrayList<dh2> x = new ArrayList<>();
        while(t-- > 0){
            String[] tmp = sc.nextLine().split(" ");
            String id = tmp[0].substring(0,2);
            int loai = Integer.parseInt(tmp[0].substring(2));
            int sl = Integer.parseInt(tmp[1]);
            for(sp2 i : l){
                if(id.equals(i.getId())){
                    x.add(new dh2(tmp[0], i.getName(), sl, i.getGia(loai)));
                    break;
                }
            }
        }
        Collections.sort(x);
        for(dh2 i : x){
            System.out.println(i);
        }
    }
}
