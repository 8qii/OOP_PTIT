import java.util.*;

class Candidate{
    public static int num = 1;
    private String name, dob;

    private int id;
    private double a,b,c;

    public Candidate(String name , String dob , double a , double b , double c){
        this.id = num++;
        this.name = name ;
        this.dob = dob ;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double sum(){
        return a + b + c;
    }

    public void display(){
        System.out.println(id + " " + name + " " + dob + " " +  sum());
    }

}

public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double max = 0;
        List<Candidate> a = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++){
            Candidate x = new Candidate(sc.nextLine() , sc.nextLine() , Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine()));
            if(x.sum() > max ) max = x.sum();
            a.add(x);
        }
        for(Candidate i : a){
            if(i.sum() == max) i.display();
        }
    }
}
