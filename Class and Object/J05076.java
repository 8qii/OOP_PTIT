import java.util.*;

class Hang{
    protected String ma , name , loai;

    public Hang(){

    }

    public Hang(String ma , String name , String loai){
        this.ma = ma;
        this.name = name;
        this.loai = loai;
    }

    public String getName() {
        return name;
    }

    public String getLoai() {
        return loai;
    }

    public String getMa() {
        return ma;
    }
}

class DonHangg extends Hang{

    protected int nhap,giaNhap,xuat;
    public DonHangg(String ma , int nhap , int giaNhap , int xuat , String name , String loai){
        super(ma, name , loai);
        this.nhap = nhap;
        this.giaNhap = giaNhap;
        this.xuat = xuat;
    }

    public String toString(){
        return ma + " " + name + " " + getGiaTriNhap() + " " + getGiaTriXuat();
    }

    public long getGiaTriNhap(){
        return nhap * giaNhap * 1l;
    }

    public long getGiaTriXuat(){
        return Math.round(xuat * giaNhap * getLai()) + xuat * giaNhap;
    }

    public float getLai(){
        if(loai.equals("A") ) return 0.08f;
        if(loai.equals("B") ) return 0.05f;
        return 0.02f;
    }


}


public class J05076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Hang> l1 = new ArrayList<>();
        List<DonHangg> l2 = new ArrayList<>();
        while(t-- > 0){
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            String loai = sc.next();
            l1.add(new Hang(id , name , loai));
        }

        t = sc.nextInt();
        while(t-- > 0){
            String id = sc.next();
            int nhap = sc.nextInt();
            int giaNhap = sc.nextInt();
            int xuat = sc.nextInt();
            Hang a = new Hang();
            for(Hang i : l1){
                if(id.equals(i.getMa())){
                    a = i;
                    break;
                }
            }
            l2.add(new DonHangg(id,nhap,giaNhap,xuat,a.getName(),a.getLoai()));
        }
        for(DonHangg i : l2){
            System.out.println(i);
        }
    }
}
