import java.util.*;

class Employee_5007 implements Comparable<Employee_5007>{
    public static int num = 1;
    private String id,name,gen,dob,address ,fid , inDate;
    public Employee_5007(String name , String gen , String dob,String address,String fid, String inDate){
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




    @Override
    public int compareTo(Employee_5007 a){
        String td = dob.substring(6) + dob.substring(3) + dob;
        String ad = a.dob.substring(6) + a.dob.substring(3) + a.dob;
        return td.compareTo(ad);
    }

}

public class J05007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Employee_5007> a = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++){
            Employee_5007 x = new Employee_5007(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        Collections.sort(a);
        for(Employee_5007 i : a){
            System.out.println(i);
        }
    }
}
