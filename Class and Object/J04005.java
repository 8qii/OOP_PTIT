import java.util.Scanner;

class Student{
    private String name;
    private String dob;
    private double m1;
    private double m2;
    private double m3;
    private double sum;

    public Student(String name , String dob , double m1 , double m2 , double m3){
        this.name = name ;
        this.dob = dob;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
 }
    public String solve(String s){
        if(s.charAt(1) == '/') s = "0" + s;
        if(s.charAt(4) == '/') s = s.substring(0, 4) + "0" + s.substring(4);
        return s;
    }

    public void display(){
        sum = m1 + m2 + m3;
        System.out.print(name + " " + solve(dob) + " " + String.format("%.1f" , sum));
    }


 }

public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String dob = sc.nextLine();
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();
        Student a = new Student(name , dob , m1 , m2 , m3);
        a.display();
    }
}
