import java.util.Scanner ;

public class J02106 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = 0;
            for(int i = 0 ; i < n ; i ++){
                int key = 0;
                for(int j = 0 ; j < 3 ; j ++){
                    int a = sc.nextInt();
                    if(a == 1) key++;
                    else key --;
                }
                if(key > 0) count++;
            }
            System.out.println(count);
    }
}
