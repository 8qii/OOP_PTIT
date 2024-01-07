import java.util.*;

class pair{
    private String key;
    private int value;

    public pair(String key , int value){
        this.key = key ;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString(){
        return key + " " + value;
    }

}


public class J03020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<pair> l = new ArrayList<>();
        int maxLen = -1;
        while(sc.hasNext()){
            String s = sc.next();
            StringBuilder ss = new StringBuilder(s);
            if(ss.reverse().toString().equals(s) && s.length() >= maxLen){
                maxLen = s.length();
                boolean contain = false;
                for(pair i : l){
                    if(i.getKey().equals(s)) {
                        i.setValue(i.getValue() + 1);
                        contain = true;
                    }
                }
                if(!contain) l.add(new pair(s , 1));
            }
        }
        for(pair i : l){
            if(i.getKey().length() == maxLen)
                System.out.println(i);
        }
    }
}