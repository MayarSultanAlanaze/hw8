import javafx.geometry.Side;

import javax.print.attribute.standard.Sides;

public class Square extends Rectangle {
    private double Square;
    private double side;

    public Square() {

    }

    public Square(double side) {

        super(side, side);
    }

    public Square(double side, double width, double length, String Color, boolean filled) {
        super(side, side, Color, filled);
    }

    public double getside() {
        return getArea();
    }

    public void setSide(double width) {
        this.side = width;
    }

    public String toString() {

        return "side" +" "+ super.getArea() + " "+ "width" + " "+ super.getWidth() +" "+ "length" +" "+ super.getLength() + " "+ "color" + " "+super.getColor() +" "+ "filled" +" " + super.isFilled();

    }
}
