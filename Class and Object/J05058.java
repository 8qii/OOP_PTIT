import java.util.*;

class ts3{
    private String ms , name ;
    private double p1 , p2 , p3;

    public ts3(String ms , String name , double p1 ,double p2 , double p3){
        this.ms = ms;
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double bonusPoint(String s){
        if(s.charAt(2) == '1') return 0.5;
        if(s.charAt(2) == '2') return 1;
        return 2.5;
    }

    public double sum() {
        return p1 + p1 + p2 + p3;
    }
    public String kq(double p1 , double p2 ,double p3){
        if(p1 + p1 + p2 + p3 +bonusPoint(ms) >= 24f) return "TRUNG TUYEN";
        return "TRUOT";
    }

    public double getMark(){
        return sum() + bonusPoint(ms);
    }

    public String formatMark(double x) {
        int xInt = (int) (x * 10);
        return xInt % 10 == 0 ? String.format("%.0f", x) : String.format("%.1f", x);
    }

    public String toString(){
        return ms + " " + name + " " + formatMark(bonusPoint(ms)) +" " + formatMark(sum() + bonusPoint(ms)) + " " + kq(p1 , p2 , p3);
    }

}


public class J05058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<ts3> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new ts3(sc.nextLine() , sc.nextLine() , Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(l , new Comparator<ts3>(){
            @Override
            public int compare(ts3 o1 , ts3 o2){
                if(o1.getMark() > o2.getMark()) return -1;
                return 1;
            }
        });
        for(ts3 i : l){
            System.out.println(i);
        }
    }
}
