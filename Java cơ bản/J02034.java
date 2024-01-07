import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[300];
        int max = 0;
        for(int i = 0 ; i < n ; i ++){
            int tmp = sc.nextInt();
            a[tmp] = 1;
            if(max < tmp) max = tmp;
        }
        int key = 1;
        for(int i = 1 ; i <= max ; i ++){
            if(a[i] == 0) {
                System.out.println(i);
                key = 0;
            }
            }
        if(key == 1) System.out.println("Excellent!");
    }
}
