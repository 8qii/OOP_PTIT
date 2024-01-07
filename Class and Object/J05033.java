import java.util.*;

class Time implements Comparable<Time>{
    private int hour , min , sec;

    public Time(int hour , int min , int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    @Override
    public String toString(){
        return hour + " " + min + " " + sec;
    }

    public int getH(){
        return hour;
    }
    public int getM(){
        return min;
    }
    public int getS(){
        return sec;
    }

    @Override
    public int compareTo(Time o) {
        int s1 = hour * 3600 + min * 60 + sec;
        int s2 = o.getH() * 3600 + o.getM() * 60 + o.getS();
        return s1 - s2;
    }


}


public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Time> a = new ArrayList<>();
        int t = sc.nextInt();
        while(t-- > 0){
            int hour = sc.nextInt();
            int min = sc.nextInt();
            int sec = sc.nextInt();
            Time tm = new Time(hour , min , sec);
            a.add(tm);
        }
        Collections.sort(a);
        for(Time i : a){
            System.out.println(i.toString());
        }
    }
}
