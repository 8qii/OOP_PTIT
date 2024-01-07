import java.util.Scanner;

class Point3D{
    private int x , y , z;

    public Point3D(int x , int y , int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static boolean check(Point3D a1 , Point3D a2 ,Point3D a3 ,Point3D a4){
        if((a2.x - a1.x) * (a3.y - a1.y) * (a4.z - a1.z) + (a3.x - a1.x) * (a4.y - a1.y) * (a2.z - a1.z) + (a4.x - a1.x) * (a2.y - a1.y) * (a3.z - a1.z) - (a3.x - a1.x) * (a2.y - a1.y) * (a4.z - a1.z) - (a2.x - a1.x) * (a4.y - a1.y) * (a3.z - a1.z) - (a4.x - a1.x) * (a3.y - a1.y) * (a2.z - a1.z) == 0) return true;
        return false;
    }
}
public class J04011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
