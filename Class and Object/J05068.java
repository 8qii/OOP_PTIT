import java.util.*;

class XangDau2{
    private String id ;
    private long sl;

    public XangDau2(String id , long sl){
        this.id = id;
        this.sl = sl;
    }

    public long getGia(){
        String s = id;
        if(s.charAt(0) == 'X') return 128000;
        if(s.charAt(0) == 'D') return 11200;
        return 9700;
    }

    public long getThue(){
        String s = id.substring(3);
        if(s.equals("TN")) return 0;
        s = id;
        if(s.charAt(0) == 'X') return 3840;
        if(s.charAt(0) == 'D') return 392;
        return 194;
    }

    public String getHang(){
        String s = id.substring(3);
        if(s.equals("BP")) return "British Petro";
        if(s.equals("ES")) return "Esso";
        if(s.equals("SH")) return "Shell";
        if(s.equals("CA")) return "Castrol";
        if(s.equals("MO")) return "Mobil";
        return "Trong Nuoc";
    }

    public long ThanhTien(){
        return (getThue() + getGia()) * sl;
    }

    @Override
    public String toString(){
        return id + " " + getHang() + " " + getGia() + " " + getThue() * sl + " " + ThanhTien();
    }

}

public class J05068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<XangDau2> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new XangDau2(sc.next() , sc.nextLong()));
        }
        Collections.sort(l, new Comparator<XangDau2>() {
            @Override
            public int compare(XangDau2 o1, XangDau2 o2) {
                if(o1.ThanhTien() < o2.ThanhTien())
                    return 1;
                return -1;
            }
        });
        for(XangDau2 i : l){
            System.out.println(i);
        }
    }
}
