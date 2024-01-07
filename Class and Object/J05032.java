import java.util.*;

class Age implements Comparable<Age>{
    private String name,dob;

    public Age(String name , String dob){
        this.name = name;
        this.dob = dob;
    }

    public int compareTo(Age a){
        String td = dob.substring(6) + dob.substring(3) + dob;
        String ad = a.dob.substring(6) + a.dob.substring(3) + a.dob;
        return ad.compareTo(td);
    }

    public String getName(){
        return name;
    }

}

public class J05032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Age> l = new ArrayList<>();
        while(t-- > 0){
            Age a = new Age(sc.next() , sc.next());
            l.add(a);
        }
        Collections.sort(l);
        System.out.println(l.get(0).getName());
        System.out.println(l.get(l.size()-1).getName());
    }
}
