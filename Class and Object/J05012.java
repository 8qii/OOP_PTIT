import java.util.*;

class TinhTien{
    private String ma ,ten ;
    private long sl, donGia , chietKhau;

    public TinhTien(String ma , String ten , long sl , long donGia , long chietKhau){
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    public long Tien(){
        return sl * donGia - chietKhau;
    }

    public String toString(){
        return ma + " " + ten +  " " + sl + " " + donGia + " " + chietKhau + " " + Tien();
    }

}

public class J05012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<TinhTien> l = new ArrayList<>();
        while(t-- > 0){
            sc.nextLine();
            String ma = sc.next();
            sc.nextLine();
            String ten = sc.nextLine();
            long sl = sc.nextLong();
            long gia = sc.nextLong();
            long chietKhau = sc.nextLong();
            l.add(new TinhTien(ma , ten , sl , gia , chietKhau));
        }
        Collections.sort(l, new Comparator<TinhTien>() {
            @Override
            public int compare(TinhTien o1, TinhTien o2) {
                if(o1.Tien() < o2.Tien())
                    return 1;
                return -1;
            }
        });
        for(TinhTien i : l){
            System.out.println(i);
        }
    }
}
