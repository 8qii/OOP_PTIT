import java.util.Scanner;

class Emp1{
    private String name , cv;
    private int baseSalary , workDate, i;
    public Emp1(String name , int baseSalary , int workDate , String cv, int i){
        this.name = name;
        this.baseSalary = baseSalary;
        this.workDate = workDate;
        this.cv = cv;
        this.i = i;
    }
    public String getId(){
        return String.format("%02d", i);
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
    public long thuclinh(){
        return (baseSalary * workDate + hsn(workDate) + bonusSalary(cv));
    }
    public void display(){
        System.out.println( "NV" + getId() + " " + name + " " + baseSalary * workDate + " " + hsn(workDate) + " " + bonusSalary(cv) + " " + (baseSalary * workDate + hsn(workDate) + bonusSalary(cv)));
    }
}

public class J05038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        long tong = 0;
        for(int i= 1; i<= t; i++){
            String ten = sc.nextLine();
            int luongngay = Integer.parseInt(sc.nextLine());
            int cong = Integer.parseInt(sc.nextLine());
            String chvu = sc.nextLine();
            Emp1 x = new Emp1(ten, luongngay, cong, chvu, i);
            x.display();
            tong += x.thuclinh();
        }
        System.out.printf("Tong chi phi tien luong: " + tong + "\n");
    }
}
