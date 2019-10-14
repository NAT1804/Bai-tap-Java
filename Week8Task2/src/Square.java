import java.awt.*;

public class Square extends Rectangle {
    public Square(double side) {
        width = side;
        length = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        width = side;
        length = side;
    }

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, color, filled);
        width = side;
        length = side;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    public void draw(Graphics graphics) {
        graphics.setColor(Color.ORANGE);
        graphics.fillRect(150, 200, 50, 50);
    }

    public void move() {

    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Square) {
            Square other = (Square) object;
            if (Math.abs((double)Math.round((this.width-other.length)*1000)/1000) <= 0.001
                    && this.topLeft.getY() == other.topLeft.getY()
                    && this.topLeft.getX() == other.topLeft.getX()) {
                return true;
            } else return false;
        }
        else return false;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[topLeft="+topLeft+",side="+getSide()+",color="+color+",filled="+filled+"]";
    }

    public static void main(String[] args) {
        Point point = new Point(5, 5);
        Shape s1 = new Circle(point, 5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); // compile time error

        Circle c1 = (Circle)s1; // ep kieu cho s1 thanh Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape(); // loi abstract

        Shape s3 = new Rectangle(point, 1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); // compile time error

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(point, 6.6, "BLUE", true);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide());// compile time error

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());// rectangle ko co method getSide
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2;// up casting
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

        Rectangle s = new Rectangle(point, 10, 9, "YELLOW", false);
        System.err.println(s.toString());
    }
}
