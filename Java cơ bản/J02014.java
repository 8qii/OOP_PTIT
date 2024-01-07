import java.util.Scanner ;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for(int i = 0 ; i < n ; i ++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            int tsum = 0;
            int key = -1;
            for(int i = 0 ; i < n ; i ++){
                if(tsum == (sum - a[i]) / 2){
                    key = i + 1;
                    break;
                }
                tsum += a[i];
            }
            System.out.println(key);
        }
    }
}
