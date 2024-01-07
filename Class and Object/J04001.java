import static java.lang.Math.*;
import java.util.Scanner;
class Point01 {
    private double x;
    private double y;

    public Point01(){

    }
    public Point01(double x , double y){
        this.x = x;
        this.y = y;
    }

    public Point01(Point01 p){
        this.x = p.x;
        this.y = p.y;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public double distance(Point01 p){
        return sqrt(pow(this.x - p.x, 2) + pow(this.y - p.y, 2));
    }

    public double distance(Point01 a , Point01 b){
        return sqrt(pow(a.x - b.x , 2) + pow(a.y - b.y , 2) );
    }

    @Override
    public String toString(){
        return x + " " + y;
    }
}
public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point01 a = new Point01(x,y);
            x = sc.nextDouble();
            y = sc.nextDouble();
            Point01 b = new Point01(x,y);
            System.out.println(String.format("%.4f" , a.distance(b)));
        }
    }
}
