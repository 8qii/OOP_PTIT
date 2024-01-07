import java.util.*;

class Gv2{
    private String name,nganh,id;
    public static int num = 1;


    public Gv2(String name,String nganh){
        this.id = String.format("GV%02d" , num++);
        this.name = name;
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
    }

    public String getIdNganh(String j){
        String[] tmp = j.split(" ");
        String s = "";
        for(int i = 0 ; i < tmp.length ; i ++){
            s += String.valueOf(tmp[i].charAt(0)).toUpperCase();
        }
        return s;
    }

    public String toString(){
        return id + " " + name + " " + getIdNganh(nganh);
    }

}

public class J05026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Gv2> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new Gv2(sc.nextLine(),sc.nextLine()));
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN BO MON " + l.get(0).getIdNganh(s) + ":");
            for(Gv2 i : l){
                if(i.getIdNganh(s).equals(i.getIdNganh(i.getNganh()))) System.out.println(i);
            }
        }
    }
}
