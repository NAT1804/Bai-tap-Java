import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<Shape>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeCircles() {
        for (int i=0; i<shapes.size(); i++) {
            if(shapes.get(i) instanceof Circle) {
                shapes.remove(i);
            }
        }
    }

    public String getInfo() {
        String result = "";
        for (Shape element : shapes) {
            result += element.toString();
            result += "\n";
        }
        return result;
    }

    public boolean check(Object object2, Object object1) {
        if (object2 instanceof Circle) {
            if (object1 instanceof Circle) {
                if (((Circle) object2).radius == ((Circle) object1).radius
                && ((Circle) object2).center.getX() == ((Circle) object1).center.getX()
                && ((Circle) object2).center.getY() == ((Circle) object1).center.getY())
                    return true;
                else return false;
            } else return false;
        }
        if (object2 instanceof Rectangle) {
            if (object1 instanceof Rectangle) {
                if (((Rectangle) object2).length == ((Rectangle) object1).length
                && ((Rectangle) object2).width == ((Rectangle) object1).width
                &&((Rectangle) object2).topLeft.getX() == ((Rectangle) object1).topLeft.getX()
                && ((Rectangle) object2).topLeft.getY() == ((Rectangle) object1).topLeft.getY())
                    return true;
                else return false;
            } else return false;
        }
        else {
            if (object1 instanceof Square) {
                if (((Square) object2).length == ((Square)object1).width
                    &&((Rectangle) object1).topLeft.getX() == ((Rectangle) object1).topLeft.getX()
                    && ((Rectangle) object1).topLeft.getY() == ((Rectangle) object1).topLeft.getY())
                    return true;
                else return false;
            } else return false;
        }
    }

    public void removeDuplicate() {
        for (int i=0; i<shapes.size(); i++) {
            for (int j=i+1; j<shapes.size(); j++) {
                if (check(shapes.get(j), shapes.get(i))) {
                    i = j;
                    shapes.remove(j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Layer layer = new Layer();
        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 3);
        Shape a = new Circle(p1, 5, "red", true);
        Shape b = new Rectangle(p1, 5, 5, "red", false);
        Shape c = new Square(p2, 5, "red", false);
        Shape d = new Circle(p1, 5, "blue", false);
        layer.addShape(a);
        layer.addShape(b);
        layer.addShape(c);
        layer.addShape(d);
        layer.removeCircles();
        layer.removeDuplicate();
        System.out.println(layer.getInfo());
    }
}
