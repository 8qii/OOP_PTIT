
import java.util.*;

class TienNuoc{
    private String name , id;

    public static int num = 1;
    private int soCu,soMoi;

    public TienNuoc(String name , int soCu , int soMoi){
        this.id = String.format("KH%02d" , num++);
        this.name = name;
        this.soCu = soCu;
        this.soMoi = soMoi;
    }

    public int suDung(){
        return soMoi - soCu;
    }

    public int ThanhTien(){
        if(suDung() <= 50){
            return (int)Math.round(suDung() * 102);
        }
        if(suDung() <= 100){
            return (int)Math.round((5000 + (suDung() - 50) * 150) * 1.03);
        }
        return (int)Math.round((12500 + (suDung() - 100) * 200) * 1.05);
    }

    @Override
    public String toString(){
        return id + " " + name + " " + ThanhTien();
    }

}

public class J05017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <TienNuoc> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(new TienNuoc(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list, new Comparator<TienNuoc>(){
            @Override
            public int compare(TienNuoc o1, TienNuoc o2) {
                return o2.ThanhTien() - o1.ThanhTien();
            }
        });
        for(TienNuoc x : list){
            System.out.println(x);
        }
    }
}
