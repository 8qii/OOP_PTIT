import java.util.*;

class SinhVien{
    private String name, msv, sdt;
    private int nhom;

    public SinhVien(String msv, String name, String sdt, int nhom ){
        this.msv = msv;
        this.name = name;
        this.sdt = sdt;
        this.nhom = nhom;
    }


    public int getNhom() {
        return nhom;
    }

    public String toString(){
        return msv + " " + name + " " + sdt;
    }

}


class qlbtn{
    private List<SinhVien> l;
    private String DuAn;

    private int nhom;

    public qlbtn(int n){
        this.l = new ArrayList<>();
        this.nhom = n;
    }

    public int getNhom(){
        return nhom;
    }

    public void AddSV(SinhVien x){
        l.add(x);
    }

    public void setDuAn(String s){
        this.DuAn = s;
    }

    public void output(){
        System.out.println("DANH SACH NHOM " + nhom + ":");
        for(SinhVien i : l){
            System.out.println(i);
        }
        System.out.println("Bai tap dang ky: " + DuAn);
    }

}

public class J06003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String u = sc.nextLine();
        String tmpp[] = u.split(" ");
        int n = Integer.parseInt(tmpp[0]);
        int k = Integer.parseInt(tmpp[1]);
        List<SinhVien> tmp = new ArrayList<>();
        List<qlbtn> nhom = new ArrayList<>();
        for(int i = 1 ; i <= k ; i ++){
            nhom.add(new qlbtn(i));
        }
        for(int i = 0 ; i < n ; i ++){
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            for(qlbtn o : nhom){
                if(o.getNhom() == x.getNhom()){
                    o.AddSV(x);
                    break;
                }
            }
        }
        for(int i = 1 ; i <= k ; i ++){
            nhom.get(i-1).setDuAn(sc.nextLine());
        }
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            int id = Integer.parseInt(sc.nextLine());
            nhom.get(id-1).output();
        }
    }
}
