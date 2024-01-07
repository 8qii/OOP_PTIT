import java.util.*;
import java.io.*;

class dsmh implements Comparable<dsmh>{
    private String id, name;
    private int tin;

    public dsmh(String id , String name , int tin){
        this.id = id;
        this.name = name;
        this.tin = tin;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + tin;
    }

    @Override
    public int compareTo(dsmh o) {
        return this.name.compareTo(o.name);
    }
}

public class J07034 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<dsmh> l = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++){
            l.add(new dsmh(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(l);
        for(dsmh i : l){
            System.out.println(i);
        }
    }
}
