
import java.util.*;

class dssv {

    private String id;
    private String name;
    private String className;
    private String email;

    public dssv(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + email;
    }
}

public class J05020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        ArrayList<dssv> arrayList = new ArrayList<>();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            arrayList.add(new dssv(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        Collections.sort(arrayList, new Comparator<dssv>() {
            @Override
            public int compare(dssv o1, dssv o2) {
                if (o1.getClassName().equals(o2.getClassName())) {
                    return o1.getId().compareTo(o2.getId());
                }
                return o1.getClassName().compareTo(o2.getClassName());
            }
        });

        for (int i = 0; i < t; i++) {
            System.out.println(arrayList.get(i));
        };
    }
}