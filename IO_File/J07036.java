import java.util.*;
import java.io.*;

class sinhVien{
    private String msv, name, lop, email;

    public sinhVien(String msv, String name, String lop, String email){
        this.msv = msv;
        this.name = nameFormat(name);
        this.lop = lop;
        this.email = email;
    }

    public String nameFormat(String s){
        s = s.trim().toLowerCase().replaceAll("\\s+", " ");
        String[] tmp = s.split(" ");
        String res = "";
        for(int i = 0 ; i < tmp.length ; i ++){
            res += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1).toLowerCase() + " ";
        }
        return res.substring(0,res.length()-1);
    }

    public String getLop() {
        return lop;
    }

    public String getName() {
        return name;
    }

    public String getMsv() {
        return msv;
    }
}

class monHoc{
    private String ma, ten;
    private int tin;

    public monHoc(String ma, String ten, int tin){
        this.ma = ma;
        this.ten = ten;
        this.tin = tin;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }
}

class bangDiem implements Comparable<bangDiem>{
    private sinhVien a;
    private monHoc b;
    private String diem;

    public bangDiem(sinhVien a, monHoc b, String diem){
        this.a = a;
        this.b = b;
        this.diem = diem;
    }
    public String getMa(){
        return b.getMa();
    }

    public  String getMSV(){
        return a.getMsv();
    }

    public String getLop() {
        return a.getLop();
    }
    public String toString(){
        return a.getMsv() + " " + a.getName() + " " + b.getMa() + " " + b.getTen() + " " + diem;
    }

    @Override
    public int compareTo(bangDiem o) {
        if(this.getMa().equals(o.getMa())) return this.getMSV().compareTo(o.getMSV());
        return this.getMa().compareTo(o.getMa());
    }
}

public class J07036 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<sinhVien> sv = new ArrayList<>();
        ArrayList<monHoc> mh = new ArrayList<>();
        ArrayList<bangDiem> bd = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            sv.add(new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine()));
        }
        sc = new Scanner(new File("MONHOC.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            mh.add(new monHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        sc = new Scanner(new File("BANGDIEM.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String[] tmp = sc.nextLine().split(" ");
            sinhVien a = null;
            monHoc b = null;
            for(sinhVien i : sv){
                if(tmp[0].equals(i.getMsv())){
                    a = i;
                    break;
                }
            }
            for(monHoc i : mh){
                if(tmp[1].equals(i.getMa())){
                    b = i;
                    break;
                }
            }
            bd.add(new bangDiem(a, b, tmp[2]));
        }
        Collections.sort(bd);
        t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String lop = sc.nextLine();
            System.out.println("BANG DIEM lop " + lop + ":");
            for(bangDiem i : bd){
                if(lop.equals(i.getLop())){
                    System.out.println(i);
                }
            }
        }
    }
}
