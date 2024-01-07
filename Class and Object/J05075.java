import java.util.*;

class DiemDanh2{
    private String id , name , lop ,dkdt,dd;

    public DiemDanh2(String id , String name , String lop){
        this.id = id;
        this.name = name;
        this.lop = lop;
    }

    public String getId() {
        return id;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }

    public String getDkdt() {
        String s = dd;
        int sum = 10;
        for (int i = 0 ; i < s.length() ; i ++){
            if(s.charAt(i) == 'm') sum--;
            else if (s.charAt(i) == 'v') sum -= 2;
        }
        if(sum <= 0) return "0 KDDK";
        return sum + "";
    }

    @Override
    public String toString(){
        return id + " " + name + " " + lop + " " + getDkdt();
    }

    public String getLop() {
        return lop;
    }
}

public class J05075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int tt = t;
        List<DiemDanh2> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new DiemDanh2(sc.nextLine() , sc.nextLine() , sc.nextLine()));
        }
        while(tt-- > 0){
            String s = sc.next();
            String d = sc.next();
            for(DiemDanh2 i : l){
                if(i.getId().equals(s)) i.setDd(d);
            }
        }
        String sss = sc.next();
        for(DiemDanh2 i : l){
            if(i.getLop().equals(sss)) System.out.println(i);
        }
    }
}
