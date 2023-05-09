public class Circle extends Shape {
    private double radius;
    private double Area;
    public Circle() {
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(String Color, boolean filled, double radius) {
        super(Color,filled);
         radius = 1.0;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {

        this.radius = radius;}
    public double getArea() {

        return radius*2;
    }
    public double getPerimeter() {

        return 2*radius*25.6;
    }

    public String toString() {

        return "Color"+ " " +super.getColor()+" "+ "filled"+" "+super.isFilled()+" "+"radius"+" "+radius;
    }


}

