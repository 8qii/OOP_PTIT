import java.util.*;

class KhachHangg{
    private String name, gen, dob, address, id;
    public static int numm = 0;
    public KhachHangg(String name, String gen, String dob, String address){
        this.id = String.format("KH%03d", ++numm);
        this.name = name;
        this.gen = gen;
        this.dob = dob;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }
}

class MatHangg{
    private String id, name, dvi;
    private int giamua, giaban;
    public static int nnum = 0;

    public MatHangg(String name, String dvi, int giamua, int giaban){
        this.id = String.format("MH%03d", ++nnum);
        this.name = name;
        this.dvi = dvi;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDvi() {
        return dvi;
    }

    public int getGiaban() {
        return giaban;
    }

    public int getGiamua() {
        return giamua;
    }

}

class DonHanggg{
    private KhachHangg a;
    private MatHangg b;
    private int sl;
    private String id ;
    public static int num = 0;
    public DonHanggg(KhachHangg a, MatHangg b, int sl){
        this.id = String.format("HD%03d", ++num);
        this.a = a;
        this.b = b;
        this.sl = sl;
    }

    public int getThanhTien(){
        return sl * b.getGiaban();
    }

    public String toString(){
        return id + " " + a.getName() + " " + a.getAddress() + " " + b.getName() + " " + b.getDvi() + " " + b.getGiamua() + " " + b.getGiaban() + " " + sl + " " + getThanhTien();
    }

}



public class J06005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHangg> khachhang = new ArrayList<>();
        ArrayList<MatHangg> mathang = new ArrayList<>();
        ArrayList<DonHanggg> donhang = new ArrayList<>();
        while(t-- > 0){
            khachhang.add(new KhachHangg(sc.nextLine(), sc.nextLine(),sc.nextLine(), sc.nextLine()));
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            mathang.add(new MatHangg(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String[] tmp = sc.nextLine().split(" ");
            KhachHangg a = null;
            MatHangg b = null;
            for(KhachHangg i : khachhang){
                if(tmp[0].equals(i.getId())){
                    a = i;
                    break;
                }
            }
            for(MatHangg i : mathang){
                if(tmp[1].equals(i.getId())){
                    b = i;
                    break;
                }
            }
            donhang.add(new DonHanggg(a, b, Integer.parseInt(tmp[2])));
        }
        for(DonHanggg i : donhang){
            System.out.println(i);
        }
    }
}
