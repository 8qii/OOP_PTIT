import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Pnt{
    private double x , y;

    public Pnt(double x , double y){
        this.x = x;
        this.y = y;
    }
    public double distance(Pnt p2) {
        return Math.sqrt((x - p2.x) * (x - p2.x) + (y - p2.y) * (y - p2.y));
    }
}

public class J04010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();

            Pnt x = new Pnt(x1,y1);
            Pnt y = new Pnt(x2,y2);
            Pnt z = new Pnt(x3,y3);

            double a = x.distance(y);
            double b = x.distance(z);
            double c = y.distance(z);

            if(a + b > c && a + c > b && c + b > a){
                double s = (1f/4f) * sqrt((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b));
                double r = a * b * c / (4 * s);
                System.out.println(String.format("%.3f" , Math.PI * r * r));
            }
            else {
                System.out.println("INVALID");
            }
        }
    }
}
