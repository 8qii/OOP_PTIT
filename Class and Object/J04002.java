import java.util.Scanner;

class Rectangle{
    private int width;
    private int height;
    private String color;

    public Rectangle(){}

    public Rectangle(int width , int height , String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth (){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
    }

    public int findArea(){
        return height * width;
    }

    public int findParameter(){
        return ( height + width) * 2;
    }
}


public class J04002 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int h = sc.nextInt();
        int w = sc.nextInt();

        if(h <= 0 || w <= 0) {
            System.out.println("INVALID");
            return ;
        }

        String c = sc.next();

        Rectangle r = new Rectangle(h,w,c);

        System.out.println(r.findParameter() + " " + r.findArea() + " " + r.getColor());

    }

}
