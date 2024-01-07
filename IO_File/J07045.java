import java.util.*;
import java.io.*;

class LoaiPhong implements Comparable<LoaiPhong>{
    private String id , name , dongia , phi;

    public LoaiPhong(String s){
        String tmp[] = s.split(" ");
        this.id = tmp[0];
        this.name = tmp[1];
        this.dongia = tmp[2];
        this.phi = tmp[3];
    }

    public String toString (){
        return id + " " + name + " " + dongia + " " + phi;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return name.compareTo(o.name);
    }

}


public class J07045 {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
