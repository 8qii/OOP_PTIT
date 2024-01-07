import java.util.*;
import java.io.*;


public class J07022 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        List<String> l = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(s.length() <= 10){
                try{
                    int n = Integer.parseInt(s);
                } catch(Exception e){
                    l.add(s);
                }
            }
            else l.add(s);
        }
        Collections.sort(l);
        for(String i : l){
            System.out.print(i + " ");
        }
    }
}
