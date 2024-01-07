import java.util.*;
import java.io.*;

class sxsv implements Comparable<sxsv>{
    private String msv, fullName, sdt, email, ten, ho, dem;
    public sxsv(String msv, String fullName, String sdt, String email){
        this.msv = msv;
        this.fullName = fullName;
        this.sdt = sdt;
        this.email  = email;
        String tmp[] = fullName.split(" ");
        this.ten = tmp[tmp.length - 1];
        this.ho = tmp[0];
        this.dem = tmp[1];
    }

    @Override
    public String toString(){
        return msv + " " + fullName + " " + sdt + " " + email;
    }

    @Override
    public int compareTo(sxsv o) {
        if(this.ten.equals(o.ten)){
            if(this.ho.equals(o.ho)) {
                if(this.dem.equals(o.dem)) return this.msv.compareTo(o.msv);
                return this.dem.compareTo(o.dem);
            }
            else return this.ho.compareTo(o.ho);
        }
        return this.ten.compareTo(o.ten);
    }
}

public class J07081 {
    public static void main(String[] args) throws  FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        List<sxsv> l = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            l.add(new sxsv(sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(l);
        for(sxsv i : l){
            System.out.println(i);
        }
    }
}
