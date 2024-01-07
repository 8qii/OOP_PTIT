import java.util.Scanner;

class Ps{
    private long ts;
    private long ms;

    public Ps(long ts, long ms){
        this.ts = ts;
        this.ms = ms;
    }

    public long ucln(long x , long y){
        while (y != 0) {
            long z = x % y;
            x = y;
            y = z;
        }
        return x;

    }

    public void getPs(){
        long a = ts;
        long b = ms;
        a = ucln(a,b);
        System.out.println( (ts/a) + "/" + (ms/a));
    }

}

public class J04003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        Ps p = new Ps(a,b);
        p.getPs();
    }
}
