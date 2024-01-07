import java.util.*;

class sp{
    private String id, name;
    private int l1, l2;
    public sp(String id, String name, int l1, int l2){
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

class dh{
    private String id, name;
    private int sl, gia;
    public static int num = 1;

    public dh(String id, String name, int sl, int gia){
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

    public String toString(){
        return id + " " + name + " " + getDiscount() + " " + (getThanhTien() - getDiscount());
    }

}


public class J06001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<sp> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new sp(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        t = Integer.parseInt(sc.nextLine());
        ArrayList<dh> x = new ArrayList<>();
        while(t-- > 0){
            String[] tmp = sc.nextLine().split(" ");
            String id = tmp[0].substring(0,2);
            int loai = Integer.parseInt(tmp[0].substring(2));
            int sl = Integer.parseInt(tmp[1]);
            for(sp i : l){
                if(id.equals(i.getId())){
                    x.add(new dh(tmp[0], i.getName(), sl, i.getGia(loai)));
                    break;
                }
            }
        }
        for(dh i : x){
            System.out.println(i);
        }
    }
}
