
import java.util.Scanner;

class Student_J04006{
    private String name;
    private String cla;
    private String dob;
    private double gpa;

    public Student_J04006(String name , String cla  ,String dob , double gpa){
        this.name = name;
        this.cla = cla;
        this.dob = dob;
        this.gpa = gpa;
    }
    public static String true_dob(String s){
        if(s.charAt(1) == '/') s = '0' + s;
        if(s.charAt(4) == '/') s = s.substring(0,3) + '0' + s.substring(3);
        return s;
    }

    public void display(){
        System.out.println("B20DCCN001 " + name + " " + cla + " " + true_dob(dob) + " " + String.format("%.2f" , gpa));
    }

}

public class J04006 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String name = sc.nextLine();
        String cla = sc.nextLine();
        String dob = sc.nextLine();
        double gpa = sc.nextDouble();

        Student_J04006 S = new Student_J04006(name , cla , dob , gpa);
        S.display();

    }
}
