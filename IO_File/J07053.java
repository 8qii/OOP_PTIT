import java.util.*;
import java.io.*;

class XetTuyen{
    private String id, name, dob;
    private float lt,th;

    private int age;
    public static int num = 0;

    public XetTuyen(String name , String dob, float lt, float th){
        this.id = "PH" + String.format("%02d", ++ num);
        this.name = name;
        this.dob = dob;
        this.lt = lt;
        this.th = th;

    }

    public void format(){
        String x = this.name;
        x = x.toLowerCase().trim();
        String tmp[] = x.split("\\s+");
        x = "";
        for(int i = 0 ; i < tmp.length ; i ++){
            x += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1) + " ";
        }
        this.name = x;
        String y = this.dob;
        String tmpp[] = y.split("/");
        if(tmpp[0].length() == 1) tmpp[0] = "0" + tmpp[0];
        if(tmpp[1].length() == 1) tmpp[1] = "0" + tmpp[1];
        y = tmpp[0] + "/" + tmpp[1] + "/" + tmpp[2];
        this.dob = y;
        this.age = 2021 - Integer.parseInt(tmpp[2]);
    }

    public float getBonusPoint(){
        if(this.lt >= 8 && this.th >= 8) return 1f;
        if(this.lt >= 7.5 && this.th >= 7.5) return 0.5f;
        return 0;
    }

    public int getMark(){
        int x =  (int)(Math.round((lt + th) / 2f + getBonusPoint()));
        if (x >= 10) return 10;
        return x;
    }

    public String getXepLoai(){
        if(getMark() >= 9) return "Xuat sac";
        if(getMark() == 8) return "Gioi";
        if(getMark() == 7) return "Kha";
        if(getMark() >= 5) return "Trung binh";
        return "Truot";
    }

    @Override
    public String toString(){
        return id + " " + name + age + " " + getMark() + " " + getXepLoai();
    }

    public int getAge() {
        return age;
    }
}


public class J07053 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<XetTuyen> l = new ArrayList<>();
        while(t-- > 0){
            XetTuyen x = new XetTuyen(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            x.format();
            l.add(x);
        }

        for(XetTuyen i : l){
            System.out.println(i);
        }
    }
}
