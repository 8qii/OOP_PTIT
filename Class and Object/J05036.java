import java.util.*;

class Ban{
    private String id,name,dv;
    private int giaNhap,soLuong;
    public static int num = 1;

    public Ban(String name , String dv, int giaNhap ,int soLuong){
        this.id = String.format("MH%02d", num++);
        this.name = name;
        this.dv = dv;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
    }

    public float getPvc(){
        return (giaNhap * soLuong) / 20;
    }

    public float getTT(){
        return giaNhap * soLuong + getPvc();
    }

    public float getGB(){
        return getTT() + getTT() / 50;
    }


    public String toString(){
        return id + " " + name + " " + dv + " " + Math.round(getPvc()) + " " + Math.round(getTT()) + " " + Math.round(getGB());
    }

}


public class J05036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Ban> l = new ArrayList<>();
        while(t-- > 0){
            Ban a = new Ban(sc.next(), sc.next() , sc.nextInt() , sc.nextInt());
            l.add(a);
        }
        for(Ban i : l){
            System.out.println(i);
        }
    }
}
