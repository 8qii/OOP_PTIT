import java.util.Arrays;
import java.util.Scanner;

class Studen implements Comparable<Studen> {

    public static int NUM = 1;
    public String id, name;
    public Float avg;

    public Studen(String name, float[] p) {
        this.id = String.format("HS%02d", NUM++);
        this.name = name;

        avg = 0f;
        for (int i = 0; i < 10; i++) {
            avg += p[i] * ((i == 0 || i == 1) ? 2f : 1f);
        }
        avg /= 12f;
        avg = Math.round(avg * 10f) / 10f;
    }

    private String xepLoai() {
        if (avg >= 9f) {
            return "XUAT SAC";
        }
        if (avg >= 8f) {
            return "GIOI";
        }
        if (avg >= 7f) {
            return "KHA";
        }
        if (avg >= 5f) {
            return "TB";
        }
        return "YEU";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.1f", avg) + " " + xepLoai();
    }

    @Override
    public int compareTo(Studen o) {
        if (this.avg.compareTo(o.avg) == 0) {
            return this.id.compareTo(o.id);
        }
        return -this.avg.compareTo(o.avg);
    }
}

public class J05018{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Studen[] list = new Studen[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            float[] p = new float[10];
            for (int j = 0; j < 10; j++) {
                p[j] = sc.nextFloat();
            }
            list[i] = new Studen(name, p);
        }

        Arrays.sort(list);
        for (Studen e : list) {
            System.out.println(e);
        }
    }
}