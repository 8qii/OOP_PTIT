import java.util.*;
import java.io.*;

class chdssv{
    private String name, id, lop, dob, gpa;

    public static int num = 0;

    public chdssv(String name, String lop, String dob, float gpa){
        this.id = String.format("B20DCCN%03d", ++num );
        this.lop = lop;
        this.name = NameFormat(name);
        this.dob = DateFormat(dob);
        this.gpa = String.format("%.2f", gpa);
    }

    public String DateFormat(String s){
        String arr[] = s.split("/");
        if(arr[0].length() == 1) arr[0] = "0" + arr[0];
        if(arr[1].length() == 1) arr[1] = "0" + arr[1];
        return arr[0] + "/" + arr[1] + "/" + arr[2];
    }

    public String NameFormat(String x){
        x = x.toLowerCase().trim();
        String tmp[] = x.split("\\s+");
        x = "";
        for(int i = 0 ; i < tmp.length ; i ++){
            x += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1) + " ";
        }
        return x.substring(0,x.length() - 1);
    }

    @Override
    public String toString(){
        return id + " " + name + " " + lop + " " + dob + " " + gpa;
    }

}

public class J07018 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<chdssv> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new chdssv(sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
        }
        for(chdssv i : l){
            System.out.println(i);
        }
    }
}
