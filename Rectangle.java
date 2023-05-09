import java.awt.geom.Area;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {

    }public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String Color, boolean filled) {
        super(Color,filled);
        this.width =1.0 ;
        this.length = 1.0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width =width;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
            {
        this.length = length;
    }

    public double getArea() {
        return length*width;
    }
      public double Perimeter(){
        return 2*length+width;

      }
    public String toString() {

        return "width" + " " + getWidth() + " " + "length" + " " + getLength() + " " + "color" + " " + getColor() + " " + "filled" + " " + isFilled();
    }
}

