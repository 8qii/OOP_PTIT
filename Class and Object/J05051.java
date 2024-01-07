import java.util.*;

class KhachHang1 implements Comparable<KhachHang1>{
    private String maKH, LoaiSD;
    private int chiSoCu, chiSoMoi;
    private static int id = 1;
    public KhachHang1(String LoaiSD, int chiSoCu, int chiSoMoi) {
        this.maKH = "KH" + String.format("%02d", id++);
        this.LoaiSD = LoaiSD;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }
    public int heSo(){
        if(this.LoaiSD.equals("KD"))
            return 3;
        if(this.LoaiSD.equals("NN"))
            return 5;
        if(this.LoaiSD.equals("TT"))
            return 4;
        return 2;
    }
    public int thanhTien(){
        return (this.chiSoMoi - this.chiSoCu) * this.heSo() * 550;
    }
    public int phuTroi(){
        int tmp = this.chiSoMoi - this.chiSoCu;
        if(tmp < 50)
            return 0;
        if(tmp <= 100)
            return Math.round(0.35f * this.thanhTien());
        return this.thanhTien();
    }
    public int tongTienPhaiTra(){
        return this.thanhTien() + this.phuTroi();
    }
    @Override
    public String toString(){
        return this.maKH + " " + this.heSo() + " " + this.thanhTien() + " " + this.phuTroi() + " " + this.tongTienPhaiTra();
    }

    @Override
    public int compareTo(KhachHang1 o) {
        return o.tongTienPhaiTra() - tongTienPhaiTra();
    }
}
public class J05051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <KhachHang1> list = new ArrayList<>();
        while(n-- > 0){
            String loaiSD = sc.next();
            int chiSoCu = sc.nextInt();
            int chiSoMoi = sc.nextInt();
            list.add(new KhachHang1(loaiSD, chiSoCu, chiSoMoi));
        }
        Collections.sort(list);
        for(KhachHang1 x : list){
            System.out.println(x);
        }
    }
}