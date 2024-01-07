import java.util.*;


class TuyenGV{
    private String name , id , mxt;
    private float th,cm;
    public static int num  = 1;

    public TuyenGV(String name , String mxt , float th , float cm){
        this.name = name ;
        this.mxt = mxt;
        this.th = th;
        this.cm = cm;
        this.id = String.format("GV%02d" , num ++);
    }

    public float getBonus(){
        String s = mxt;
        s = String.valueOf(s.charAt(1));
        if(s.equals("1")) return 2;
        if(s.equals("2")) return 1.5f;
        if(s.equals("3")) return 1.0f;
        return 0;
    }

    public float getMark(){
        return th * 2 + cm + getBonus();
    }

    public String getXepLoai(){
        if(getMark() >= 18) return "TRUNG TUYEN";
        return "LOAI";
    }

    public String getMon(){
        Character c = mxt.charAt(0);
        if(c == 'A') return "TOAN";
        if(c == 'B') return "LY";
        return "HOA";
    }

    public String toString(){
        return id + " " + name + " " + getMon() + " " + getMark() + " " + getXepLoai();
    }

}

public class J05014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<TuyenGV> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new TuyenGV(sc.nextLine() , sc.nextLine() , Float.parseFloat(sc.nextLine()) , Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(l, new Comparator<TuyenGV>() {
            @Override
            public int compare(TuyenGV o1, TuyenGV o2) {
                if(o1.getMark() > o2.getMark()) return -1;
                return 1;
            }
        });
        for(TuyenGV i : l){
            System.out.println(i);
        }
    }
}
