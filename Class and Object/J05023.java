import java.util.*;

class lksv2{
    private String id, name, lop, mail;
    public lksv2(String id , String name , String lop , String mail){
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

public class J05023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<lksv2> l = new ArrayList<>();
        while(t-- > 0){
            lksv2 a = new lksv2(sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine());
            l.add(a);
        }
        t =Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            String tdn = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + tdn + ":");
            tdn = tdn.substring(2);
            for(lksv2 i : l){
                String ss = i.getLop();
                ss = ss.substring(1,3);
                if(ss.equals(tdn)) System.out.println(i);
            }
        }
    }
}
