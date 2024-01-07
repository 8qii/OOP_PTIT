import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Emp2 implements Comparable<Emp2>{
    private String name , cv,id;
    public static int num = 1;
    private int baseSalary , workDate;
    public Emp2(String name , int baseSalary , int workDate , String cv){
        this.name = name;
        this.baseSalary = baseSalary;
        this.workDate = workDate;
        this.cv = cv;
        this.id = String.format("NV%02d",num++);
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

    @Override
    public String toString(){
        return ( id + " " + name + " " + baseSalary * workDate + " " + hsn(workDate) + " " + bonusSalary(cv) + " " + (baseSalary * workDate + hsn(workDate) + bonusSalary(cv)));
    }

    @Override
    public int compareTo(Emp2 a){
        return (int)(a.thuclinh() - thuclinh());
    }

}

public class J05041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Emp2> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new Emp2(sc.nextLine(), Integer.parseInt(sc.nextLine()) , Integer.parseInt(sc.nextLine()) , sc.nextLine()));
        }
        Collections.sort(l);
        for(Emp2 i : l){
            System.out.println(i);
        }
    }
}
