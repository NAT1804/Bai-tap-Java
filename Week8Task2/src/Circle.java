import javax.swing.*;
import java.awt.*;

public class Circle extends Shape {
    final double PI = 3.14;
    protected double radius;
    protected Point center = new Point(100, 100);

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Circle) {
            Circle other = (Circle) object;
            if (Math.abs((double)Math.round((this.radius-other.radius)*1000)/1000) <= 0.001
                    && this.center.getX() == other.center.getX()
                    && this.center.getY() == other.center.getY()) {
                return true;
            } else return false;
        }
        else return false;
    }

    public void draw(Graphics graphics) {
        graphics.setColor(Color.red);
        graphics.fillOval((int)center.getX(), (int)center.getY(), 20, 20);
    }

    public void move() {
        double x = center.getX();
        x++;
        center.setX(x);
        double y = center.getX();
        y++;
        center.setY(y);
    }

    @Override
    public double getArea() {
        return (double)Math.round(radius*radius*PI*10)/10;
    }

    @Override
    public double getPerimeter() {
        return (double)Math.round(2*radius*PI*10)/10;
    }

    @Override
    public String toString() {
        return "Circle[center="+center+",radius="+radius+",color="+color+",filled="+filled+"]";
    }
}
