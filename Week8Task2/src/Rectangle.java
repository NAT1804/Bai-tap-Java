import java.awt.*;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    protected Point topLeft;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    public Rectangle(Point topLeft, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
    }

    public Rectangle() {}

    public Rectangle(String color, boolean filled) {}

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

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public boolean equals(Object object) {
        if (object instanceof Rectangle) {
            Rectangle other = (Rectangle) object;
            if (Math.abs((double)Math.round((this.width-other.width)*1000)/1000) <= 0.001
                    && Math.abs((double)Math.round((this.length-other.length)*1000)/1000) <= 0.001
                    && this.topLeft.getY() == other.topLeft.getY()
                    && this.topLeft.getX() == other.topLeft.getX()) {
                return true;
            } else return false;
        }
        else return false;
    }

    public void draw(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(200, 150, 90, 50);
    }

    public void move() {

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
        return "Rectangle[topLeft="+topLeft+",width="+width+",length="+length+",color="+color+",filled="+filled+"]";
    }
}
