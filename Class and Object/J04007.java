import java.util.Scanner;

class Employee{
    private String name;
    private String gen;
    private String dob;
    private String address;
    private String phone_num;
    private String  in_date;

    public Employee(String name , String gen , String dob , String address , String phone_num , String in_date){
        this.name = name ;
        this.gen = gen;
        this.dob = dob;
        this.address = address;
        this.phone_num = phone_num;
        this.in_date = in_date;
    }
    public String true_date(String s){
        if(s.charAt(1) == '/') s = '0' + s;
        if(s.charAt(4) == '/') s = s.substring(0,3) + '0' + s.substring(3);
        return s;
    }
    public void display(){
        System.out.println("00001 " + name + " " + gen + " " + true_date(dob) + " " + address + " " + phone_num + " " + true_date(in_date));
    }
}


public class J04007 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String name = sc.nextLine();
        String gen = sc.nextLine();
        String dob = sc.nextLine();
        String address = sc.nextLine();
        String phone_num = sc.nextLine();
        String date_in = sc.nextLine();

        Employee  e = new Employee(name , gen , dob , address , phone_num , date_in);
        e.display();
    }
}
