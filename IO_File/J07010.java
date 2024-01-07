
import java.io.*;
import java.util.*;

class dssv{
    private String name, id, dob, lop;
    private float gpa;

    public static int num = 1;

    public dssv(String name , String lop , String dob, float gpa){
        this.id = String.format("B20DCCN%03d", num++);
        this.name = name;
        this.lop = lop;
        this.dob = dob;
        this.gpa = gpa;
    }

    public String date_format(){
        String x = this.dob;
        String arr[] = x.split("/");
        if(arr[0].length() == 1) arr[0] = "0" + arr[0];
        if(arr[1].length() == 1) arr[1] = "0" + arr[1];
        return arr[0] + "/" + arr[1] + "/" + arr[2];
    }

    public String gpa_format(){
        return String.format("%.2f", gpa);
    }

    @Override
    public String toString(){
        return id + " " + name + " " + lop + " " + date_format() + " " + gpa_format();
    }
}

public class J07010 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < n ; i ++){
            dssv x = new dssv(sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
            System.out.println(x);
        }
    }
}
