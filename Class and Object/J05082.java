import java.util.*;

class KhachHang2{
    private String name , gen , dob, address , id;
    public static int num = 1;

    public KhachHang2(String name , String gen , String dob , String address){
        this.name = name;
        this.gen = gen;
        this.dob = dob;
        this.address = address;
        this.id = String.format("KH%03d" , num ++);
    }

    public String formatDate(String k){
        String s = k;
        if(s.charAt(1) == '/') s = "0" + s;
        if(s.charAt(4) == '/') s = s.substring(0,3) + '0' + s.substring(4);
        return s;
    }

    public String formatName(String k){
        String s = k;
        s = s.trim().toLowerCase();
        s = s.replaceAll("\\s+" , " ");
        String[] tmp = s.split(" ");
        s = "";
        for(int i = 0 ; i < tmp.length ; i ++){
            String a = tmp[i];
            a = String.valueOf(a.charAt(0)).toUpperCase() + a.substring(1);
            s = s + a + " ";
        }
        return s.substring(0,s.length() - 1);
    }

    @Override
    public String toString(){
        return id + " " + formatName(name)+ " " + gen + " " +  address + " " + formatDate(dob);
    }


    public int getCmp(){
        String s = formatDate(dob);
        return Integer.parseInt(s.substring(6)) * 400 + Integer.parseInt(s.substring(3,5)) * 40 + Integer.parseInt(s.substring(0,2));
    }

}



public class J05082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<KhachHang2> l = new ArrayList<>();
        while(t-- > 0){
            String name = sc.nextLine();
            String gen = sc.nextLine();
            String dob = sc.nextLine();
            String  address = sc.nextLine();
            l.add(new KhachHang2(name , gen, dob , address));
        }
        Collections.sort(l, new Comparator<KhachHang2>() {
            @Override
            public int compare(KhachHang2 o1, KhachHang2 o2) {
                return o1.getCmp() - o2.getCmp();
            }
        });
        for(KhachHang2 i : l){
            System.out.println(i);
        }
    }
}