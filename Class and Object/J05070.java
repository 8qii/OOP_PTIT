import java.util.*;

class clb1{
    protected String ma,ten;
    protected int gia;

    public clb1(){

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

    public clb1(String ma , String ten , int gia){
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }
}

class Tran1 extends clb1{
    private String maTran;
    private int luotXem;

    public Tran1(String maTran , int luotXem , String ma , String ten , int gia){
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


public class J05070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<clb1> l = new ArrayList<>();
        while(t-- > 0){
            String ma = sc.next();
            sc.nextLine();
            String ten = sc.nextLine();
            int giaVe = sc.nextInt();
            l.add(new clb1(ma, ten, giaVe));
        }
        t = sc.nextInt();
        List<Tran1> l2 = new ArrayList<>();
        while(t-- > 0){
            String s = sc.next();
            int k = sc.nextInt();
            String tmp  = s.substring(1,3);
            for(clb1 i : l){
                if(tmp.equals(i.getMa())){
                    l2.add(new Tran1(s , k , i.getMa() , i.getTen() , i.getGia()));
                    break;
                }
            }
        }
        Collections.sort(l2, new Comparator<Tran1>() {
            @Override
            public int compare(Tran1 o1, Tran1 o2) {
                return (int)(o2.getDoanhThu() - o1.getDoanhThu());
            }
        });
        for (Tran1 i : l2){
            System.out.println(i);
        }
    }
}