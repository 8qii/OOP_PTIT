import java.util.*;

class sv implements Comparable<sv>{
    private String msv, name, sdt;
    private int nhom;

    public sv(String msv, String name, String sdt, int nhom){
        this.msv = msv;
        this.name = name;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public String toString(){
        return msv + " " + name + " " + sdt + " " + nhom + " ";
    }

    @Override
    public int compareTo(sv o) {
        return this.msv.compareTo(o.msv);
    }

    public int getNhom() {
        return nhom;
    }
}

public class J06004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sv> l = new ArrayList<>();
        String[] tmp = sc.nextLine().split(" ");
        int n = Integer.parseInt(tmp[0]);
        int k = Integer.parseInt(tmp[1]);
        while(n -- > 0){
            l.add(new sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        String[] a = new String[k+1];
        for(int i = 1 ; i <= k ; i ++){
            a[i] = sc.nextLine();
        }
        Collections.sort(l);
        for(sv i : l){
            System.out.print(i);
            System.out.println(a[i.getNhom()]);
        }
    }
}
