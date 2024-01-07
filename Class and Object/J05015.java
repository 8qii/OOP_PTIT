import java.util.*;

class DuaXe{
    private String name , donvi , time;
    private int speed;

    public DuaXe(String name , String donvi, String time){
        this.donvi = donvi;
        this.name = name ;
        this.time = time;
    }

    public String getId(){
        String k = donvi + " " + name ;
        k = k.toUpperCase();
        String res = "";
        String[] tmp = k.split(" ");
        for(int i = 0 ; i < tmp.length ; i ++){
            res += tmp[i].charAt(0);
        }
        return res;
    }

    public String getTime() {
        return time;
    }

    public int getSpeed(){
        float runTime = Integer.parseInt(String.valueOf(time.charAt(0))) - 6 + Float.parseFloat(time.substring(2)) / 60;
        return (int)(Math.round((double)(120 / runTime)));
    }

    @Override
    public String toString(){
        return getId() + " " + name + " " + donvi + " " + getSpeed() + " Km/h";
    }

}


public class J05015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<DuaXe> l = new ArrayList<>();
        while(t-- > 0){
            sc.nextLine();
            l.add(new DuaXe(sc.nextLine() , sc.nextLine() , sc.next()));
        }
        Collections.sort(l, new Comparator<DuaXe>() {
            @Override
            public int compare(DuaXe o1, DuaXe o2) {
                return o1.getTime().compareTo(o2.getTime());
            }
        });
        for(DuaXe i : l){
            System.out.println(i);
        }
    }
}
