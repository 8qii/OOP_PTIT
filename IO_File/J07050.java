import java.util.*;
import java.io.*;

class sxmh implements Comparable<sxmh>{
    private String ten, loai, id;
    private float nhap, ban;
    public static int num = 0;

    public sxmh(String ten, String loai, float nhap, float ban){
        this.ten = ten;
        this.loai = loai;
        this.nhap = nhap;
        this.ban = ban;
        this.id = String.format("MH%02d", ++num);
    }

    public float getLai(){
        return ban - nhap;
    }

    @Override
    public String toString(){
        return id + " " + ten + " " + loai + " " + String.format("%.2f",getLai());
    }


    @Override
    public int compareTo(sxmh o) {
        if(getLai() > o.getLai()) return -1;
        return 1;
    }
}

public class J07050 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<sxmh> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new sxmh(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()),  Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(l);
        for(sxmh i : l ){
            System.out.println(i);
        }
    }
}
