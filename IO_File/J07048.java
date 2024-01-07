import java.util.*;
import java.io.*;

class dssp2 implements Comparable<dssp2>{
    private String ma ,ten ;
    private int giaban, baohanh;

    public dssp2(String ma , String ten , int giaban , int baohanh){
        this.ma = ma;
        this.ten = ten;
        this.giaban = giaban;
        this.baohanh = baohanh;
    }

    @Override
    public String toString(){
        return ma + " " + ten + " " + giaban + " " + baohanh;
    }

    @Override
    public int compareTo(dssp2 o) {
        if (o.giaban == giaban){
            return ma.compareTo(o.ma);
        }
        return o.giaban - giaban;
    }
}

public class J07048 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<dssp2> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new dssp2(sc.nextLine() , sc.nextLine() , Integer.parseInt(sc.nextLine()) , Integer.parseInt(sc.nextLine())));

        }
        Collections.sort(l);
        for(dssp2 i : l){
            System.out.println(i);
        }
    }
}
