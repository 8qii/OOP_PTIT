/* Author: NgTienHungg */

import java.util.Scanner;

class Point1 {

    public double x, y;

    public Point1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point1 p2) {
        return Math.sqrt((x - p2.x) * (x - p2.x) + (y - p2.y) * (y - p2.y));
    }
}

public class J04009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point1[] tri = new Point1[3];
            for (int i = 0; i < 3; i++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                tri[i] = new Point1(x, y);
            }

            double a = tri[0].distance(tri[1]);
            double b = tri[1].distance(tri[2]);
            double c = tri[0].distance(tri[2]);

            if (a + b > c && b + c > a && a + c > b) {
                double S = 1 / 4f * Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c));
                System.out.printf("%.2f\n", S);
            } else {
                System.out.println("INVALID");
            }
        }
    }
}