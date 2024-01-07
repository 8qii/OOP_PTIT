import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
class sv3 implements Comparable<sv3>{

    public static int NUM = 1;
    public String id, name, classs, dateOfBirth;
    public float gpa;

    public sv3(String name, String classs, String dateOfBirth, float gpa) {
        this.id = String.format("B20DCCN%03d", NUM++);
        this.name = name;
        this.classs = classs;
        this.dateOfBirth = dateOfBirth;
        this.gpa = gpa;
    }

    public String nameFormat(String s){
        s = s.trim().toLowerCase();
        s = s.replaceAll("\\s+" , " ");
        String[] tmp = s.split(" ");
        s = "";
        for(int i = 0 ; i < tmp.length ; i ++){
            String k = tmp[i];
            k = String.valueOf(k.charAt(0)).toUpperCase() + k.substring(1);
            s += k + " ";
        }
        return s.substring(0,s.length() - 1);
    }

    @Override
    public String toString() {
        return id + " " + nameFormat(name) + " " + classs + " " + dateOfBirth + " " + String.format("%.2f", gpa);
    }

    @Override
    public int compareTo(sv3 a){
        if(this.gpa - a.gpa > 0) return -1;
        return 1;
    }

}

public class J05005 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<sv3> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String classs = sc.nextLine();
            String dateOfBirth = sdf.format(sdf.parse(sc.nextLine()));
            float gpa = Float.parseFloat(sc.nextLine());
            sv3 student = new sv3(name, classs, dateOfBirth, gpa);
            a.add(student);
        }
        Collections.sort(a);
        for(sv3 i : a){
            System.out.println(i);
        }
    }
}