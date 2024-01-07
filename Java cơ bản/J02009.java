import java.util.*;

class Clients implements Comparable<Clients>{
    private int come;
    private int time;

    public Clients(int come , int time){
        this.come = come;
        this.time = time;
    }

    public int getCome(){
        return come;
    }

    public int getTime(){
        return time;
    }

    @Override
    public int compareTo(Clients a){
        return this.come - a.getCome();
    }


}
public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Clients> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Clients x = new Clients(sc.nextInt() , sc.nextInt());
            a.add(x);
        }
        Collections.sort(a);
        int now = 0;
        for(Clients i : a){
            if(i.getCome() >= now) now = i.getCome() + i.getTime();
            else now = now + i.getTime();
        }
        System.out.println(now);
    }

}
