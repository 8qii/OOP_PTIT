import java.util.*;
import java.io.*;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true){
            String s = sc.nextLine();
            if(s.equals("END")){
                break;
            }
            s = s.toLowerCase().trim();
            String tmp[] = s.split("\\s+");
            s = "";
            for(int i = 0 ; i < tmp.length ; i ++){
                tmp[i] = String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
                s += tmp[i] + " ";
            }
            System.out.println(s);
        }
    }
}
