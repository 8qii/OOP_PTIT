import java.util.*;

class PhanSo{
    private long tu , mau;

    public  PhanSo(long tu , long mau){
        this.tu = tu;
        this.mau = mau;
    }



    public long getMau() {
        return mau;
    }

    public long getTu() {
        return tu;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public PhanSo rutGon(){
        long x = tu;
        long y = mau;
        while(x != y){
            if(x > y) x -= y;
            else y -= x;
        }
        return new PhanSo((long)(tu / x) , (long)(mau / x));
    }

    public PhanSo Add(PhanSo a){
        long x = tu * a.getMau() + mau * a.getTu();
        long y = mau * a.getMau();
        PhanSo u = new PhanSo(x,y);
        return u.rutGon();
    }

    public PhanSo Mul(PhanSo a){
        long x = tu * a.getTu();
        long y = mau * a.getMau();
        return new PhanSo(x,y).rutGon();
    }

    @Override
    public String toString(){
        return tu + "/" + mau;
    }

}


public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            PhanSo a = new PhanSo(sc.nextLong() , sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong() , sc.nextLong());
            PhanSo c = a.Add(b);
            PhanSo d = c.Mul(c);
            PhanSo e = a.Mul(b.Mul(d));
            System.out.println(d + " " + e);
        }
    }
}
