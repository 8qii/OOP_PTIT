import java.util.*;
import java.io.*;

class NameBuilder implements Comparable<NameBuilder>{
    private String name, ten, ho, dem;

    public NameBuilder(String name){
        String s = NameFormat(name);
        this.name = s;
        String tmp[] = s.split(" ");
        this.ten = tmp[tmp.length - 1];
        this.ho = tmp[0];
        this.dem = tmp[1];
    }

    public String NameFormat(String x){
        x = x.toLowerCase().trim();
        String tmp[] = x.split("\\s+");
        x = "";
        for(int i = 0 ; i < tmp.length ; i ++){
            x += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1) + " ";
        }
        return x.substring(0,x.length() - 1);
    }

    @Override
    public int compareTo(NameBuilder o) {
        if(this.ten.equals(o.ten)){
            if(this.ho.equals(o.ho)){
                return this.dem.compareTo(o.dem);
            }
            else return this.ho.compareTo(o.ho);
        }
        else return this.ten.compareTo(o.ten);
    }

    @Override
    public String toString(){
        return this.name;
    }

}

public class J07072 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<NameBuilder> l = new ArrayList<>();
        while(sc.hasNext()){
            l.add(new NameBuilder(sc.nextLine()));
        }
        Collections.sort(l);
        for(NameBuilder i : l){
            System.out.println(i);
        }
    }
}
