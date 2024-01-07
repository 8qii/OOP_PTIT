import java.util.*;

class tl5077{
    private String id,name,pb,rpb;
    private int base,num,sal;

    public tl5077(String id , String name , int base, int num){
        this.id = id;
        this.name = name;
        this.base = base;
        this.num = num;
    }

    public String getPb(){
        return id.substring(3,5);
    }

    public void setRpb(String rpb) {
        this.rpb = rpb;
    }

    public int getHs(){
        String cl = String.valueOf(id.charAt(0));
        int n = Integer.parseInt(id.substring(1,3));
        if(cl.equals("A")){
            if(n >= 1 && n <= 3) return 10;
            if(n >= 4 && n <= 8) return 12;
            if(n >= 9 && n <= 15) return 14;
            return 20;
        }
        if(cl.equals("B")){
            if(n >= 1 && n <= 3) return 10;
            if(n >= 4 && n <= 8) return 11;
            if(n >= 9 && n <= 15) return 13;
            return 16;
        }
        if(cl.equals("C")){
            if(n >= 1 && n <= 3) return 9;
            if(n >= 4 && n <= 8) return 10;
            if(n >= 9 && n <= 15) return 12;
            return 14;
        }
        if(n >= 1 && n <= 3) return 8;
        if(n >= 4 && n <= 8) return 9;
        if(n >= 9 && n <= 15) return 11;
        return 13;
    }

    public void setPb(String pb) {
        this.pb = pb;
    }

    public int getSal() {
        return base * num * getHs() * 1000;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}

public class J05077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<String> pp = new ArrayList<>();
        while(t-- > 0){
            pp.add(sc.nextLine());
        }
        t = Integer.parseInt(sc.nextLine());
        List<tl5077> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new tl5077(sc.nextLine(), sc.nextLine() , Integer.parseInt(sc.nextLine()) , Integer.parseInt(sc.nextLine())));
        }
        for(tl5077 i : l){
            String s = i.getPb();
            for(String j : pp){
                String ss = j.substring(0,2);
                if(s.equals(ss)){
                    s = j.substring(3);
                    break;
                }
            }
            i.setRpb(s);
        }
        String sg = sc.next();
        String s = sg;
        for(String j : pp){
            String ss = j.substring(0,2);
            if(s.equals(ss)){
                s = j.substring(3);
                break;
            }
        }
        System.out.println("Bang luong phong " + s + ":");
        for(tl5077 i : l){
            if(sg.equals(i.getPb())){
                System.out.println(i.getId() + " "+ i.getName() + " " + i.getSal());
            }
        }
    }
}
