public class Circle extends Shape{
    final double PI = 3.14;
    protected double radius;
    protected Point center;

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

    public int hashCode() {
        return 0;
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

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 2);
        Circle c = new Circle(p1, 5.00001, "red", true);
        Circle a = new Circle(p2, 5, "red", true);
        System.out.println(c.equals(a));
    }
}
