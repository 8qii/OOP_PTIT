import java.util.*;

class XangDau{
    private String id ;
    private long sl;

    public XangDau(String id , long sl){
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

    @Override
    public String toString(){
        return id + " " + getHang() + " " + getGia() + " " + getThue() * sl + " " + (getThue() + getGia()) * sl;
    }

}

public class J05067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<XangDau> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new XangDau(sc.next() , sc.nextLong()));
        }
        for(XangDau i : l){
            System.out.println(i);
        }
    }
}
