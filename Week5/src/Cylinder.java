public class Cylinder extends Circle{
    private double height = 1.0;
    public Cylinder() {

    }
    public Cylinder(double radius) {
        super(radius);
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getRadius()*getRadius()*PI*height;
    }
    @Override
    public String toString() {
        return "Cylinder[Circle[radius=" + getRadius() + ",color=" + getColor() + "],height=" + height + "]";
    }
    public double getArea() {
        return 2*getRadius()*getRadius()*PI + height*getRadius()*2*PI;
    }
    public static void main(String[] args) {
        Cylinder s = new Cylinder(2.0, 3.0);
        System.err.println(s.getArea());
        System.err.println(s.getVolume());
        System.err.println(s.toString());
    }
}
