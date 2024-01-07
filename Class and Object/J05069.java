import java.util.*;

class clb{
    protected String ma,ten;
    protected int gia;

    public clb(){

    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getGia() {
        return gia;
    }

    public clb(String ma , String ten , int gia){
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }
}

class Tran extends clb{
    private String maTran;
    private int luotXem;

    public Tran(String maTran , int luotXem , String ma , String ten , int gia){
        super(ma , ten , gia);
        this.maTran =  maTran;
        this.luotXem = luotXem;
    }

    public long getDoanhThu(){
        return gia * luotXem;
    }


    @Override
    public String toString(){
        return maTran + " " + ten + " " + getDoanhThu();
    }

}


public class J05069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<clb> l = new ArrayList<>();
        while(t-- > 0){
            String ma = sc.next();
            sc.nextLine();
            String ten = sc.nextLine();
            int giaVe = sc.nextInt();
            l.add(new clb(ma, ten, giaVe));
        }
        t = sc.nextInt();
        List<Tran> l2 = new ArrayList<>();
        while(t-- > 0){
            String s = sc.next();
            int k = sc.nextInt();
            String tmp  = s.substring(1,3);
            for(clb i : l){
                if(tmp.equals(i.getMa())){
                    l2.add(new Tran(s , k , i.getMa() , i.getTen() , i.getGia()));
                    break;
                }
            }
        }
        for (Tran i : l2){
            System.out.println(i);
        }
    }
}