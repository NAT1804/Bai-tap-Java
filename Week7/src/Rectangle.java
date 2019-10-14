public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle() {}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return (double)Math.round(width*length*10)/10;
    }

    @Override
    public double getPerimeter() {
        return (double)Math.round(2*(width + length)*10)/10;
    }

    @Override
    public String toString() {
        return "Rectangle[width="+width+",length="+length+",color="+color+",filled="+filled+"]";
    }
}
