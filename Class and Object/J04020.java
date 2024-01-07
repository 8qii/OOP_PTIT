import java.util.*;

class Pair<A,B>{
    private A first ;
    private B second ;

    public Pair(A first , B second){
        this.first = first;
        this.second = second;
    }

    public A getFirst(){
        return first;
    }

    public B getSecond() {
        return second;
    }

    public boolean isPrime(){
        int n = (Integer)(this.first);
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        int m = (Integer)(this.second);
        for(int i = 2; i <= Math.sqrt(m); i++){
            if(m % i == 0)
                return false;
        }
        return n > 1 && m > 1;
    }

    public String toString(){
        return first + " " +second;
    }

}



public class J04020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
