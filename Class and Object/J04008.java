import java.util.Scanner;

import static java.lang.Math.*;

class Point_J04008{
    private double x;
    private double y;

    public Point_J04008(){

    }
    public Point_J04008(double x , double y){
        this.x = x;
        this.y = y;
    }
    public Point_J04008(Point_J04008 p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point_J04008 p){
        return sqrt(pow(this.x - p.x , 2) + pow(this.y - p.y , 2));
    }

    public double distance(Point_J04008 p1 , Point_J04008 p2){
        return sqrt(pow(p1.x - p2.x , 2) + pow(p1.y - p2.y , 2));
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

}


public class J04008 {

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

            Point_J04008 a = new Point_J04008(x1,y1);
            Point_J04008 b = new Point_J04008(x2,y2);
            Point_J04008 c = new Point_J04008(x3,y3);

            double d12 = a.distance(b);
            double d23 = b.distance(c);
            double d13 = a.distance(c);

            if(d12 + d23 > d13 && d23 + d13 > d12 && d13 + d12 > d23){
                double par = d12 + d23 + d13;
                System.out.println(String.format("%.3f" , par));

            }
            else {
                System.out.println("INVALID");
            }
        }
    }
}
