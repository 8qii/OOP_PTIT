import java.util.Scanner;

public class J01006 {

    public static void main(String[] args) {
        long[] a = new long[100];

        Scanner sc = new Scanner(System.in);
        a[1] = 1;
        a[2] = 1;

        for(int i = 3 ; i <  93 ; i ++){
            a[i] = a[i-1] + a[i-2];
        }
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            System.out.println(a[n]);
            t--;
        }
    }

}
