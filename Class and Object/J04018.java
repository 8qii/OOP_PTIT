import java.util.*;

class SoPhuc{
    private int a,b;

    public SoPhuc(int a , int b){
        this.a = a;
        this.b = b;
    }

    public SoPhuc getSum(SoPhuc x){
        return new SoPhuc(a + x.a, b + x.b);
    }

    public SoPhuc getMul(SoPhuc x){
        return new SoPhuc(a * x.a - b * x.b , a * x.b + b * x.a);
    }

    @Override
    public String toString(){
        String s = a + " ";
        if(b >= 0) s += "+ " + b + "i";
        else s += "- " + (-b) + "i";
        return s;
    }


}

public class J04018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            SoPhuc a = new SoPhuc(sc.nextInt() , sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt() , sc.nextInt());

            SoPhuc sum = a.getSum(b);
            SoPhuc res1 = a.getMul(sum);
            SoPhuc res2 = sum.getMul(sum);

            System.out.println(res1 + ", " + res2);


        }
    }
}
