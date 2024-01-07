import java.util.*;

class LuongMua{
    private String name , id;
    private int luongmua , thoiGian;

    public static int num = 1;

    public LuongMua(String name){
        this.name = name;
        this.id = String.format("T%02d" , num ++);
        this.luongmua = 0;
        this.thoiGian = 0;
    }

    public String getName() {
        return name;
    }

    public void addTime(int a){
        this.thoiGian += a;
    }

    public void addMua(int a){
        this.luongmua += a;
    }

    public float toHour(){
        return thoiGian/60f;
    }

    public float TrungBinh(){
        return luongmua/toHour();
    }

    public String toString(){
        return id + " " + name + " " + String.format("%.2f", TrungBinh());
    }


}


public class J05019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        List<LuongMua> l = new ArrayList<>();
        while(t-- > 0){
            sc.nextLine();
            String name = sc.nextLine();
            String s = sc.next();
            String e = sc.next();
            int mua = sc.nextInt();
            int a = Integer.parseInt(e.substring(0,2)) * 60 + Integer.parseInt(e.substring(3,5)) - Integer.parseInt(s.substring(0,2)) * 60 - Integer.parseInt(s.substring(3,5));
            boolean added = false;
            for(LuongMua i : l){
                if(name.equals(i.getName())){
                    i.addMua(mua);
                    i.addTime(a);
                    added = true;
                    break;
                }
            }
            if(!added){
                LuongMua x = new LuongMua(name);
                x.addTime(a);
                x.addMua(mua);
                l.add(x);
            }
        }
        for(LuongMua i : l){
            System.out.println(i);
        }
    }
}
