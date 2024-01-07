import java.util.*;

class lksv3{
    private String id, name, lop, mail;
    public lksv3(String id , String name , String lop , String mail){
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.mail = mail;
    }

    public String getId(){
        return id;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + lop + " " + mail;
    }

    public String getNganh(){
        String tmp = this.id.substring(5, 7);
        if(this.lop.charAt(0) != 'E' && tmp.equals("CN"))
            return "CONG NGHE THONG TIN";
        if(tmp.equals("KT"))
            return "KE TOAN";
        if(this.lop.charAt(0) != 'E' && tmp.equals("AT"))
            return "AN TOAN THONG TIN";
        if(tmp.equals("VT"))
            return "VIEN THONG";
        if(tmp.equals("DT"))
            return "DIEN TU";
        return "";
    }
}

public class J05024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<lksv3> l = new ArrayList<>();
        while(t-- > 0){
            lksv3 a = new lksv3(sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine());
            l.add(a);
        }
        t =Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            String up = sc.nextLine();
            up = up.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + up + ":");
            for(lksv3 i : l){
                if(i.getNganh().equals(up)) System.out.println(i);
            }
        }
    }
}
