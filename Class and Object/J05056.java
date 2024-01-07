import java.util.*;
import java.math.*;



public class J05056 {
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

        for(Vdv i : l){
            System.out.println(i);
        }
    }
}
