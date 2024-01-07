import java.util.*;

public class J02037 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();

            String[] tmp = s.split(" ");
            int cnt = 0;

            for(int i = 0 ; i < tmp.length ; i ++){
                int k = Integer.parseInt(tmp[i]);
                if(k % 2 == 0) cnt--;
                else cnt++;
            }
            if(cnt == 0) System.out.println("NO");
            else{
                if(cnt > 0 && tmp.length % 2 == 1) System.out.println("YES");
                else if(cnt < 0 && tmp.length % 2 == 0) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
