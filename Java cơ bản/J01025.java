import java.util.*;

public class J01025 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int[] x = new int[4];
        int[] y = new int[4];
        for (int i = 0; i < 4; i++) {
            x[i] = ip.nextInt();
            y[i] = ip.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);

        int a = Math.max(x[3] - x[0], y[3] - y[0]);
        System.out.println(a * a);
    }
}