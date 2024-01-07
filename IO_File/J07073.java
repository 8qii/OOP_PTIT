import java.util.*;
import java.io.*;

class dkht implements Comparable<dkht>{
    private String ma, name, LT, TH;
    private int soTC;

    public dkht(String ma, String name, int soTC, String LT, String TH){
        this.ma = ma;
        this.name = name;
        this.soTC = soTC;
        this.LT = LT;
        this.TH = TH;
    }

    public boolean isTrucTuyen() {
        String k = this.TH;
        String code = "";
        if (k.length() >= 12) {
            code = k.substring(k.length() - 12);
        }
        if (k.equals("Truc tuyen") || code.equals(".ptit.edu.vn")) return true;
        return false;
    }

    public String toString(){
        return ma + " " + name + " " + soTC + " " + LT + " " + TH;
    }

    @Override
    public int compareTo(dkht o) {
        return this.ma.compareTo(o.ma);
    }
}

public class J07073 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<dkht> l = new ArrayList<>();
        while(t-- > 0){
            dkht x = new dkht(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            if(x.isTrucTuyen()) l.add(x);
        }
        Collections.sort(l);
        for(dkht i : l){
            System.out.println(i);
        }
    }
}
