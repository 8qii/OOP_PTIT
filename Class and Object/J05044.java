import java.util.*;

class NhanVien1{
    private String maNV, hoTen, chucVu;
    private int luongCoBan, soNgayCong;
    private static int id = 1;
    public NhanVien1(String hoTen, String chucVu, int luongCoBan, int soNgayCong) {
        this.maNV = String.format("NV%02d", id++);
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
    }
    public int phuCap(){
        if("GD".equals(this.chucVu))
            return 500;
        if("PGD".equals(this.chucVu))
            return 400;
        if("TP".equals(this.chucVu))
            return 300;
        if("KT".equals(this.chucVu))
            return 250;
        return 100;
    }

    public String getChucVu() {
        return chucVu;
    }

    public int luongChinh(){
        return this.luongCoBan * this.soNgayCong;
    }
    public int tamUng(){
        int tmp = this.phuCap() + this.luongChinh();
        if(tmp * 2.0/3 < 25000)
            return (int) Math.round(tmp*2.0/3000)*1000;
        return 25000;
    }
    public int conLai(){
        return (this.luongChinh() + this.phuCap()) - this.tamUng();
    }

    @Override
    public String toString(){
        return this.maNV + " " + this.hoTen + " " + this.phuCap() + " " + this.luongChinh() + " " + this.tamUng() + " " + this.conLai();
    }
}
public class J05044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <NhanVien1> list = new ArrayList<>();
        while(n-- > 0){
            sc.nextLine();
            String hoTen = sc.nextLine();
            String chucVu = sc.nextLine();
            int luongCoBan = sc.nextInt();
            int soNgayCong = sc.nextInt();
            list.add(new NhanVien1(hoTen, chucVu, luongCoBan, soNgayCong));
        }
        String s = sc.next();
        for(NhanVien1 x : list){
            if(s.equals(x.getChucVu())) System.out.println(x);
        }
    }
}