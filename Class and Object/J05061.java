
import java.util.*;

class ThiSinh2 implements Comparable<ThiSinh2>{
    private String maTS, hoTen, ngaySinh;
    private double diemLyThuyet, diemThucHanh;
    private static int id = 1;

    public ThiSinh2(String hoTen, String ngaySinh, double diemLyThuyet, double diemThucHanh) {
        this.maTS = "PH" + String.format("%02d", id++);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }
    public int tuoi(){
        return 2021 - Integer.parseInt(this.ngaySinh.substring(6));
    }
    public double diemThuong(){
        if(this.diemLyThuyet >= 8 && this.diemThucHanh >= 8)
            return 1;
        if(this.diemLyThuyet >= 7.5 && this.diemThucHanh >= 7.5)
            return 0.5;
        return 0;
    }
    public int diemTB(){
        int dtb = (int) Math.round((this.diemLyThuyet + this.diemThucHanh)/2 + this.diemThuong());
        if(dtb > 10)
            return 10;
        return dtb;
    }
    public String xepLoai(){
        if(this.diemTB() < 5)
            return "Truot";
        if(this.diemTB() <= 6)
            return "Trung binh";
        if(this.diemTB() == 7)
            return "Kha";
        if(this.diemTB() == 8)
            return "Gioi";
        return "Xuat sac";
    }

    @Override
    public String toString(){
        return this.maTS + " " + this.hoTen + " " + this.tuoi() + " " + this.diemTB() + " " + this.xepLoai();
    }

    @Override
    public int compareTo(ThiSinh2 o1) {
        if(diemTB() == o1.diemTB()){
            return maTS.compareTo(o1.maTS);
        }
        return o1.diemTB() - diemTB();
    }
}
public class J05061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <ThiSinh2> list = new ArrayList<>();
        while(n-- > 0){
            String hoTen = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double diemLyThuyet = Double.parseDouble(sc.nextLine());
            double diemThucHanh = Double.parseDouble(sc.nextLine());
            list.add(new ThiSinh2(hoTen, ngaySinh, diemLyThuyet, diemThucHanh));
        }
        Collections.sort(list);
        for(ThiSinh2 x : list){
            System.out.println(x);
        }
    }
}