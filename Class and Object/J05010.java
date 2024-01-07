import java.util.*;

class MatHang implements Comparable<MatHang>{
    private String name,nhom;
    private float giamua,giaban,loi;
    public static int num = 1;
    private int id;

    public MatHang(String name , String nhom , float giamua , float giaban){
        this.id = num++;
        this.name = name;
        this.nhom = nhom;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loi = giaban-giamua;
    }



    @Override
    public String toString(){
        return id + " " + name + " " + nhom + " " + String.format("%.2f" , loi);
    }

    @Override
    public int compareTo(MatHang a){
        if(a.loi > loi) return 1;
        return -1;
    }

}


public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = Integer.parseInt(sc.nextLine());
        List<MatHang> l = new ArrayList<>();
        while(t-- > 0) {
            MatHang a = new MatHang(sc.nextLine() , sc.nextLine() , Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            l.add(a);
        }
        Collections.sort(l);
        for(MatHang i : l){
            System.out.println(i);
        }
    }
}
