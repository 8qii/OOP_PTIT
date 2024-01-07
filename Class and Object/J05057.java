import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ts2{
    private String ms , name ;
    private double p1 , p2 , p3;

    public ts2(String ms , String name , double p1 ,double p2 , double p3){
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

    public String formatMark(double x) {
        int xInt = (int) (x * 10);
        return xInt % 10 == 0 ? String.format("%.0f", x) : String.format("%.1f", x);
    }

    public String toString(){
        return ms + " " + name + " " + formatMark(bonusPoint(ms)) +" " + formatMark(sum()) + " " + kq(p1 , p2 , p3);
    }

}


public class J05057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<ts2> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new ts2(sc.nextLine() , sc.nextLine() , Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine())));
        }
        for(ts2 i : l){
            System.out.println(i);
        }
    }
}
