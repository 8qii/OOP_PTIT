import java.util.Scanner;

public class J02010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for(int i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();
        }
        int step = 1;
        for(int i = 0 ; i < n - 1 ; i ++){
            int key = 0;
            for(int j = i + 1 ; j < n ; j ++){
                if(a[i] > a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    key = 1;
                }
            }
            if(key == 1){
                System.out.print("Buoc " + step + ":" );
                step ++;
                for(int k = 0 ; k < n ; k ++){
                    System.out.print(" " + a[k]);
                }
                System.out.println();
            }
        }
    }
}
