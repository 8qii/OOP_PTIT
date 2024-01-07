import java.util.*;

class Employee_5006{
    public static int num = 1;
    private String id,name,gen,dob,address ,fid , inDate;
    public Employee_5006(String name , String gen , String dob,String address,String fid, String inDate){
        this.id = String.format("%05d" , num++);
        this.name = name;
        this.gen = gen;
        this.dob = dob;
        this.address = address;
        this.fid = fid;
        this.inDate = inDate;
    }
    @Override
    public String toString(){
        return id + " " + name +" " + gen + " " + dob + " " + address + " " + fid + " " + inDate;
    }


}

public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Employee_5006> a = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++){
            Employee_5006 x = new Employee_5006(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        for(Employee_5006 i : a){
            System.out.println(i);
        }
    }
}
