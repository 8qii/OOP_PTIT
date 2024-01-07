import java.util.*;

class Lop{
    private String ma , tenMH , nhom , tenGV;

    public Lop(String ma , String tenMH , String nhom , String tenGV){
        this.ma = ma;
        this.tenMH = tenMH;
        this.nhom = nhom;
        this.tenGV = tenGV;
    }

    public String toString(){
        return ma  + " " + tenMH + " " + nhom;
    }

    public String getMaMH(){
        return ma;
    }

    public String getNhomLop() {
        return nhom;
    }

    public String getTenGv() {
        return tenGV;
    }
}

public class J05080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Lop> list = new ArrayList<>();
        while(n-- > 0){
            String maMonHoc = sc.next();
            sc.nextLine();
            String tenMonHoc = sc.nextLine();
            String nhomLop = sc.nextLine();
            String tenGiangVien = sc.nextLine();
            list.add(new Lop(maMonHoc, tenMonHoc, nhomLop, tenGiangVien));
        }
        int m = sc.nextInt();
        sc.nextLine();
        while(m-- > 0){
            String gv = sc.nextLine();
            ArrayList <Lop> res = new ArrayList<>();
            for(Lop x : list){
                if(x.getTenGv().equals(gv)){
                    res.add(x);
                }
            }
            Collections.sort(res, new Comparator<Lop>(){
                @Override
                public int compare(Lop o1, Lop o2) {
                    if(o1.getMaMH().equals(o2.getMaMH()))
                        return Integer.parseInt(o1.getNhomLop()) - Integer.parseInt(o2.getNhomLop());
                    return o1.getMaMH().compareTo(o2.getMaMH());
                }
            });
            System.out.println("Danh sach cho giang vien " + gv + ":");
            for(Lop x : res){
                System.out.println(x);
            }
        }
    }

}
