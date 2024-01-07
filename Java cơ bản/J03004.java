import java.util.Scanner;
public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        //sc.next();
        while(t-- > 0)
        {
            String s = sc.nextLine();
            s = s.trim().toLowerCase();
            s = s.replaceAll("\\s+", " ");
            for (int i = 0; i < s.length(); i++) {
                if (i == 0) s = String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1);
                if (s.charAt(i) == ' ')
                    s = s.substring(0, i + 1) + String.valueOf(s.charAt(i + 1)).toUpperCase() + s.substring(i + 2);
            }
            System.out.println(s);
        }
    }
}
