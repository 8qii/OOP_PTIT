import java.util.*;
import java.io.*;

class DanhSachCaThi implements Comparable<DanhSachCaThi>{
    private String id, date, time, ma;
    public static int num = 0;

    public DanhSachCaThi(String date,String time, String ma){
        this.date = date;
        this.time = time;
        this.ma = ma;
        this.id = String.format("C%03d", ++num);
    }

    public String dateCom(){
        return this.date.substring(6) + this.date.substring(3,5) + this.date.substring(0,2);
    }

    @Override
    public String toString(){
        return id + " " + this.date + " " + this.time + " " + this.ma;
    }

    @Override
    public int compareTo(DanhSachCaThi o) {
        if(this.date.equals(o.date)) {
            if(this.time.equals(o.time)) return this.id.compareTo(o.id);
            else return this.time.compareTo(o.time);
        }
        return this.dateCom().compareTo(o.dateCom());
    }
}


public class J07059 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int t = sc.nextInt();
        List<DanhSachCaThi> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new DanhSachCaThi(sc.next(), sc.next(), sc.next()));
        }
        Collections.sort(l);
        for(DanhSachCaThi i : l){
            System.out.println(i);
        }
    }
}
