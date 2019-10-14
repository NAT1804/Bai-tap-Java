public class Circle extends Shape{
    final double PI = 3.14;
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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
        return "Circle[radius="+radius+",color="+color+",filled="+filled+"]";
    }

    public static void main(String[] args) {
        Circle c = new Circle(5.00001, "red", true);
        Circle a = new Circle(5, "red", true);
        System.out.println(c.equals(a));
    }
}
