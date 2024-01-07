import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import java.util.concurrent.ConcurrentMap;

class dslt implements Comparable<dslt> {
    private String id , name , roomId;
    private Date den, di;
    public static int num = 0;

    public dslt(String name , String roomId, String den, String di) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        this.name = name ;
        this.roomId = roomId;
        this.den = format.parse(den);
        this.di = format.parse(di);
        this.id = String.format("KH%02d", ++num);
    }

    public int getNgay(){
        return (int)((this.di.getTime() - this.den.getTime()) / (1000 * 60 * 60 * 24) );
    }

    @Override
    public String toString(){
        return id + " " + name + " " + roomId + " " + getNgay();
    }


    @Override
    public int compareTo(dslt o) {
        return o.getNgay() - getNgay();
    }
}


public class J07046 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        List<dslt> l = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            l.add(new dslt(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(l);
        for(dslt i : l){
            System.out.println(i);
        }
    }
}
