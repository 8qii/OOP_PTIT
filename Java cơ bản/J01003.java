import java.util.Scanner;
public class J01003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a= sc.nextInt();
        double b = sc.nextInt();
        if(a == 0){
            if(b == 0) System.out.print("VSN");
            else System.out.print("VN");
        }
        else System.out.print(String.format("%.2f" , -b/a));
    }
}
