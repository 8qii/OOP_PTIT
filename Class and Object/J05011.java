import java.util.*;

class Timer implements Comparable<Timer>{
    private String id , name , in , out;
    private int time;
    public Timer(String id , String name , String in , String out){
        this.id = id;
        this.name = name;
        this.in = in;
        this.out = out;
        this.time = (Integer.parseInt(out.substring(0,2)) * 60) + (Integer.parseInt(out.substring(3,5))) - (Integer.parseInt(in.substring(0,2)) * 60) - (Integer.parseInt(in.substring(3,5)));
    }

    public int getHour(){
        return (int)Math.ceil(time/60);
    }

    public int getMin(){
        return time % 60;
    }

    @Override
    public String toString(){
        return id + "  " + name  + " " + getHour() + " gio " + getMin() + " phut";
    }

    @Override
    public int compareTo(Timer a){
        return a.time - time;
    }

}

public class J05011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int t = Integer.parseInt(sc.nextLine());
        List<Timer> l = new ArrayList<>();
        while(t-- > 0){
            Timer a = new Timer(sc.nextLine() , sc.nextLine() ,sc.nextLine() , sc.nextLine());
            l.add(a);
        }
        Collections.sort(l);
        for(Timer i : l){
            System.out.println(i);
        }
    }
}
