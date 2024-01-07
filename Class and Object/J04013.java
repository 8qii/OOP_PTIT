import java.util.Scanner;

class ts{
    private String ms , name ;
    private double p1 , p2 , p3;

    public ts(String ms , String name , double p1 ,double p2 , double p3){
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


    public void display(){
        System.out.println(ms + " " + name + " " + formatMark(bonusPoint(ms)) +" " + formatMark(sum()) + " " + kq(p1 , p2 , p3) );
    }
}


public class J04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ts t = new ts(sc.nextLine() , sc.nextLine() , Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine()));

        t.display();
    }
}
