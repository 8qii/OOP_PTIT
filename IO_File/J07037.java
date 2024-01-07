import java.util.*;
import java.io.*;

class dsdn{
    private String ma , name ;
    private int sl;

    public dsdn(String ma, String name, int sl){
        this.ma = ma;
        this.name = name;
        this.sl = sl;
    }

    @Override
    public String toString(){
        return ma + " " + name  + " " + sl;
    }

    public String getMa() {
        return ma;
    }
}

public class J07037 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<dsdn> l = new ArrayList<>();
        while(n-- > 0){
            l.add(new dsdn(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(l, new Comparator<dsdn>() {
            @Override
            public int compare(dsdn o1, dsdn o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });

        for(dsdn i : l){
            System.out.println(i);
        }
    }
}
