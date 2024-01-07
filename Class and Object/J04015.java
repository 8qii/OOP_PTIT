import java.util.Scanner;

class Teacher{
    private String code , name;
    private int salary;

    public Teacher(String code , String name , int salary){
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    String cv;
    String heso;
    public int getHeso(){
        String b = this.code.substring(2);
        return Integer.parseInt(b);
    }

    public int getBaseSalary(){
        String s = this.code.substring(0,2);
        if(s.equals("HT")) return 2000000;
        if(s.equals("HP")) return 900000;
        return 500000;
    }
    public int calc(){
        return salary * this.getHeso() + this.getBaseSalary();
    }

    public String getCode(){
        return code;
    }
    public String getName(){
        return name ;

    }
    public int getSalary(){
        return salary;
    }
}


public class J04015 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String code = sc.nextLine();
        String name = sc.nextLine();
        int salary = sc.nextInt();

        Teacher a = new Teacher(code , name , salary);

        System.out.println(a.getCode() + " " + a.getName() + " " + a.getHeso() + " " + a.getBaseSalary() + " " + a.calc());
    }
}

