import java.util.*;

class dstt implements Comparable<dstt>{
    private String id, name, lop, mail, dn ;
    private int stt;
    public static int num = 1;

    public dstt(String id , String name , String lop , String mail , String dn){
        this.stt = num ++;
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.mail = mail;
        this.dn = dn;
    }

    public String getDn(){
        return dn;
    }

    @Override
    public String toString(){
        return stt + " " + id + " " + name + " " + lop + " " + mail + " " + dn;
    }

    @Override
    public int compareTo(dstt a){
        return name.compareTo(a.name);
    }

}

public class J05034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<dstt> l = new ArrayList<>();
        while(t-- > 0){
            dstt a = new dstt(sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine(), sc.nextLine());
            l.add(a);
        }
        Collections.sort(l);
        t =Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            String tdn = sc.nextLine();
            for(dstt i : l){
                if(i.getDn().equals(tdn)) System.out.println(i);
            }
        }
    }
}
