import java.util.*;

class Gv implements Comparable<Gv>{
    private String name,nganh,id;
    public static int num = 1;


    public Gv(String name,String nganh){
        this.id = String.format("GV%02d" , num++);
        this.name = name;
        this.nganh = nganh;
    }
    public String getLastName(){
        String[] tmp = name.split(" ");
        String s = tmp[tmp.length - 1];
        return s;
    }

    public String getNganh(){
        String[] tmp = nganh.split(" ");
        String s = "";
        for(int i = 0 ; i < tmp.length ; i ++){
            s += String.valueOf(tmp[i].charAt(0)).toUpperCase();
        }
        return s;
    }

    public String toString(){
        return id + " " + name + " " + getNganh();
    }

    public int compareTo(Gv a){
        if(a.getLastName().equals(getLastName())) return id.compareTo(a.id);
        return getLastName().compareTo(a.getLastName());
    }

}

public class J05025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Gv> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new Gv(sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(l);
        for(Gv i : l){
            System.out.println(i);
        }
    }
}
