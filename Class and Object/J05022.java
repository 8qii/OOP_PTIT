import java.util.*;

class lksv{
    private String id, name, lop, mail;
    public lksv(String id , String name , String lop , String mail){
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.mail = mail;
    }

    public String getLop(){
        return lop;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + lop + " " + mail;
    }

}

public class J05022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<lksv> l = new ArrayList<>();
        while(t-- > 0){
            lksv a = new lksv(sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine());
            l.add(a);
        }
        t =Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            String tdn = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + tdn + ":");
            for(lksv i : l){
                if(i.getLop().equals(tdn)) System.out.println(i);
            }
        }
    }
}
