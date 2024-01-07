import java.io.*;
import java.util.*;
public class HELLOFILE {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        Scanner sc = new Scanner(new File("Hello.txt"));
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}
