import java.util.Scanner;

class Emp{
    private String name , cv;
    private int baseSalary , workDate;
    public Emp(String name , int baseSalary , int workDate , String cv){
        this.name = name;
        this.baseSalary = baseSalary;
        this.workDate = workDate;
        this.cv = cv;
    }

    public int bonusSalary(String s){
        if(s.equals("GD")) return 250000;
        if(s.equals("PGD")) return 200000;
        if(s.equals("TP")) return 180000;
        return 150000;
    }

    public int hsn(int a){
        if(a >= 25) return this.baseSalary * this.workDate * 20 / 100;
        if(a >= 22 ) return this.baseSalary * this.workDate * 10 / 100;
        return 0;
    }
    public void display(){
        System.out.println( "NV01" + " " + name + " " + baseSalary * workDate + " " + hsn(workDate) + " " + bonusSalary(cv) + " " + (baseSalary * workDate + hsn(workDate) + bonusSalary(cv)));
    }
}

public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emp e = new Emp(sc.nextLine() , sc.nextInt() , sc.nextInt() , sc.next());

        e.display();
    }
}
