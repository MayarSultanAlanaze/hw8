import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Shape s1=new Shape("rud",true);
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        Square s2=new Square(10);
        System.out.println(s2.toString());


        Rectangle a=new Rectangle();
        System.out.println(a.getLength());
       Rectangle a1=new Rectangle(88.2,8);
       System.out.println(a1.getLength());
        Rectangle a2=new Rectangle(10,20,"white",true);
        System.out.println(a2.toString());


        Circle m=new Circle();
        System.out.println(m.getPerimeter());
        Circle m1=new Circle(9.0);
        System.out.println(m1.getRadius());
        Circle m2=new Circle("red",true,78.7);
        System.out.println(m2.toString());


        Square n=new Square(6.0);
        System.out.println(n.getside());
        Square n1=new Square(12,40,3.4,"dh",true);
        System.out.println(n1.toString());

        }
    }

