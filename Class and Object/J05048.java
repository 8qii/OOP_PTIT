import java.util.ArrayList;
import java.util.Scanner;

class MatHang1{
    private String maHang;
    private int soLuongNhap;

    public MatHang1(String maHang, int soLuongNhap) {
        this.maHang = maHang;
        this.soLuongNhap = soLuongNhap;
    }
    public int soLuongXuat(){
        if(this.maHang.charAt(0) == 'A')
            return Math.round(0.6f * this.soLuongNhap);
        return Math.round(0.7f * this.soLuongNhap);
    }
    public int donGia(){
        if(this.maHang.charAt(this.maHang.length() - 1) == 'Y')
            return 110000;
        return 135000;
    }
    public int tien(){
        return this.soLuongXuat() * this.donGia();
    }
    public int thue(){
        if(this.maHang.charAt(0) == 'A'){
            if(this.maHang.charAt(this.maHang.length() - 1) == 'Y')
                return (int) (0.08 * this.tien());
            return (int) (0.11 * this.tien());
        }
        else{
            if(this.maHang.charAt(this.maHang.length() - 1) == 'Y')
                return (int) (0.17 * this.tien());
            return (int) (0.22 * this.tien());
        }
    }

    @Override
    public String toString(){
        return this.maHang + " " + this.soLuongNhap + " " + this.soLuongXuat()
                + " " + this.donGia() + " " + this.tien() + " " + this.thue();
    }
}
public class J05048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <MatHang1> list = new ArrayList <>();
        while(n-- > 0){
            String maHang = sc.next();
            int soLuongNhap = sc.nextInt();
            list.add(new MatHang1(maHang, soLuongNhap));
        }
        for(MatHang1 x : list){
            System.out.println(x);
        }
    }
}