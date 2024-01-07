import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

class TienPhong implements Comparable<TienPhong>{
    private String name, phong, id;
    private Date nhan, tra;
    private int PhatSinh, ngay;
    public static int num = 0;

    public TienPhong(String name, String phong, String nhan, String tra, int PhatSinh) throws ParseException {
        this.id = String.format("KH%02d", ++num);
        this.name = nameFormat(name);
        this.phong = phong;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        this.nhan = format.parse(dateFormat(nhan));
        this.tra = format.parse(dateFormat(tra));
        this.PhatSinh = PhatSinh;
    }

    public int getDonGia(){
        Character x = phong.charAt(0);
        if(x == '1')  return 25;
        else if(x == '2')  return 34;
        else if(x == '3')  return 50;
        return 80;
    }

    public String nameFormat(String x){
        x = x.trim().toLowerCase();
        String tmp[] = x.split("\\s+");
        x = "";
        for(int i = 0 ; i < tmp.length ; i ++){
            x += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1) + " ";
        }
        return x;
    }

    public String dateFormat(String s){
        String y = s;
        String tmp[] = y.split("/");
        if(tmp[0].length() == 1) tmp[0] = "0" + tmp[0];
        if(tmp[1].length() == 1) tmp[1] = "0" + tmp[1];
        y = tmp[0] + "/" + tmp[1] + "/" + tmp[2];
        return y;
    }

    public void setNgay() {
        this.ngay = (int)((this.tra.getTime() - this.nhan.getTime()) / (1000 * 60 * 60 * 24) + 1);
    }

    public int thanhTien(){
        return ngay * getDonGia() + PhatSinh;
    }

    @Override
    public String toString(){
        return id + " " +  name + phong + " " + ngay + " " + thanhTien();
    }

    @Override
    public int compareTo(TienPhong o) {
        return o.thanhTien() - thanhTien();
    }
}

public class J07051 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<TienPhong> l = new ArrayList<>();
        while(t-- > 0){
            TienPhong x = new TienPhong(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            x.setNgay();
            l.add(x);
        }
        Collections.sort(l);
        for(TienPhong i : l){
            System.out.println(i);
        }
    }
}
