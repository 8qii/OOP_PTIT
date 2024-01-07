import java.util.*;

class dntt2 implements Comparable<dntt2>{

    private String id,name;
    private int sl;

    public dntt2(String id , String name , int sl){
        this.id = id;
        this.name = name;
        this.sl = sl;
    }

    public int getSl(){
        return sl;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + sl;
    }

    @Override
    public int compareTo(dntt2 a){
        if(this.sl == a.sl){
            return id.compareTo(a.id);
        }
        return a.sl - sl;
    }

}


public class J05029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<dntt2> l = new ArrayList<>();
        while(t-- > 0){
            dntt2 a = new dntt2(sc.nextLine() , sc.nextLine() , Integer.parseInt(sc.nextLine()));
            l.add(a);
        }
        Collections.sort(l);
        int k = sc.nextInt();
        for(int i = 0 ; i < k ; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for(dntt2 s : l){
                if(s.getSl() <= b && s.getSl() >= a) System.out.println(s);
            }
        }
    }
}
