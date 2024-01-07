import java.util.*;
import java.math.*;

class Vdv{
    private String name , id  ,dob, start , end;

    public static int num = 1;
    private int xh;

    public Vdv(String name , String dob , String start , String end){
        this.name = name ;
        this.dob = dob;
        this.start = start;
        this.end = end;
        this.id = String.format("VDV%02d" , num++);
    }

    public String SecondToHour(int a){
        String s = "";
        int x = Math.round(a/3600);
        a = a % 3600;
        s = String.format("%02d",x);
        x = Math.round(a/60);
        a = a % 60;
        s += String.format(":%02d",x);
        x = Math.round(a/60);
        a = a % 60;
        s += String.format(":%02d",a);
        return s;
    }

    public int HourToSecond(String s){
        return Integer.parseInt(s.substring(0,2)) * 3600 + Integer.parseInt(s.substring(3,5)) * 60 + Integer.parseInt(s.substring(6));
    }

    public String getRunTime(){
        int s = HourToSecond(end) - HourToSecond(start);
        return SecondToHour(s);
    }

    public int UuTien(){
        String[] arr = dob.split("/");
        int tuoi = 2021 - Integer.parseInt(arr[2]);
        if(tuoi >= 32) return 3;
        if(tuoi >= 25) return 2;
        if(tuoi >= 18) return 1;
        return 0;
    }

    public int getTT(){
        return  HourToSecond(getRunTime()) - UuTien();
    }

    public void setXh(int xh) {
        this.xh = xh;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + getRunTime() + " " + SecondToHour(UuTien()) + " " + SecondToHour(getTT()) + " " +  xh;
    }

    public String getId() {
        return id;
    }
}

public class J05055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Vdv> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new Vdv(sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine()));
        }
        Collections.sort(l , new Comparator<Vdv>() {
            @Override
            public int compare(Vdv o1 , Vdv o2) {
                return (int)(o1.getTT() - o2.getTT());
            }
        });
        int rank = 0,cnt = 1;
        int Cur = -1;
        for(Vdv x : l){
            if(x.getTT() == Cur){
                cnt++;
            }
            else{
                rank += cnt;
                cnt = 1;
            }
            Cur = x.getTT();
            x.setXh(rank);
        }

        Collections.sort(l , new Comparator<Vdv>(){
            @Override
           public int compare(Vdv o1 , Vdv o2){
               return o1.getId().compareTo(o2.getId());
            }
        });
        for(Vdv i : l){
            System.out.println(i);
        }
    }
}
