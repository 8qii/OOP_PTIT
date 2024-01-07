import java.util.*;

class Item implements Comparable<Item>{


    private String iCode , iName , dv ;
    private int nhap , xuat;

    public static int num = 1;

    public Item(String iName , String dv , int nhap , int xuat){
        this.iCode = "MH" + String.format("%03d", num++);
        this.iName = iName;
        this.dv = dv;
        this.nhap = nhap;
        this.xuat = xuat;
    }

    public void setICode(String s){
        this.iCode = iCode;
    }

    public int getNhap(){
       return nhap;
    }

    public int getXuat(){
        return xuat;
    }

    public void display(){
        System.out.println(iCode + " " + iName + " " + dv + " " + nhap + " " + xuat + " " + (xuat - nhap));
    }

    public int compareTo(Item a){
        int x = this.xuat - this.nhap;
        int y = a.getXuat() - a.getNhap();
        return y - x;
    }
}

public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<Item> a = new ArrayList<>();
        for(int i = 1 ; i <= n ; i ++){
            String name = sc.nextLine();
            String dv = sc.nextLine();
            int nhap = Integer.parseInt(sc.nextLine());
            int xuat = Integer.parseInt(sc.nextLine());

            Item x = new Item(name , dv , nhap , xuat);

            if(i < 10){
                String s = "MH00" + i;
                x.setICode(s);
            }
            else if (i < 100){
                String s = "MH0" + i;
                x.setICode(s);
            }
            else x.setICode("MH + i");
            a.add(x);

        }
        Collections.sort(a);
        for(Item i : a){
            i.display();
        }
    }
}
