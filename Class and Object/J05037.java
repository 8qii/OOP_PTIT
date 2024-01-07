import java.util.*;

class Ban2 implements Comparable<Ban2>{
    private String id,name,dv;
    private int giaNhap,soLuong;
    public static int num = 1;

    public Ban2(String name , String dv, int giaNhap ,int soLuong){
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

    public int getGB(){
        float a = getTT() + getTT() / 50;
        a = a / soLuong;
        a = a / 100;
        double b = Math.ceil(a);
        b *= 100;
        return (int)b;
    }


    public String toString(){
        return id + " " + name + " " + dv + " " + Math.round(getPvc()) + " " + Math.round(getTT()) + " " + getGB();
    }

    @Override
    public int compareTo(Ban2 a){
        return a.getGB() - getGB();
    }

}


public class J05037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Ban2> l = new ArrayList<>();
        while(t-- > 0){
            Ban2 a = new Ban2(sc.next(), sc.next() , sc.nextInt() , sc.nextInt());
            l.add(a);
        }
        Collections.sort(l);
        for(Ban2 i : l){
            System.out.println(i);
        }
    }
}
