public class Shape {
    private String Color;
    private boolean filled=true;

    public Shape() {

    }
    public Shape(String Color, boolean filled) {
        this.Color =Color;
        this.filled = filled;

    }

    public String getColor()
    {
        return Color;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setColor(String color)
    {
        this.Color = color;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
}

