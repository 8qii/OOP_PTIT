import java.util.Scanner;
public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        //sc.next();
        while(t-- > 0)
        {
            String s = sc.nextLine();
            s = s.trim().toLowerCase();
            s = s.replaceAll("\\s+" , " ");
            String[] word = s.split( " ");
            for(int i = 1 ; i < word.length ; i ++){
                word[i] = String.valueOf(word[i].charAt(0)).toUpperCase() + word[i].substring(1);
            }
            word[0] = word[0].toUpperCase();
            s = "";
            for(int i = 1 ; i < word.length - 1 ; i ++){
                s += word[i] + " ";
            }
            s += word[word.length - 1];
            s += ", " + word[0];
            System.out.println(s);
        }
    }
}
