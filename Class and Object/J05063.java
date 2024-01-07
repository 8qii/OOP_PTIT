import java.util.*;

class DaThuc{

    private int[] bac ;
    private String dathuc;

    public DaThuc(String dathuc){
        this.dathuc= dathuc;
    }

    public DaThuc(int[] x){
        this.bac = x;
    }



    public int[] solve(String s){
        int[] bacc = new int[10001];
        String[] tmp = s.split(" ");
        for(int i = 0 ; i < tmp.length ; i ++){
            if(tmp[i].equals("+"));
            else{
                String k = tmp[i];
                int j = 0;
                while(k.charAt(j) != '*') j ++;
                int a = Integer.parseInt(k.substring(0,j));
                while(k.charAt(j) != '^') j ++;
                int b = Integer.parseInt(k.substring(j+1));
                bacc[b] += a;
            }
        }
        return bacc;
    }

    public DaThuc cong(DaThuc o){
        String tmp = this.dathuc + " + " + o.dathuc;
        return new DaThuc(solve(tmp));

    }

    public String toString (){
        String res = "";
        for(int i = bac.length - 1 ; i >= 0 ; i --){
            if(bac[i] > 0) res += bac[i] + "*x^" + i + " + ";
        }
        res = res.substring(0,res.length() - 3);
        return res;
    }

}


public class J05063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}
