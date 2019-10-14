import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Layer extends JPanel implements Runnable{
    private List<Shape> shapes = new ArrayList<Shape>();
    private Circle circle = new Circle();
    private Rectangle rectangle = new Rectangle();
    private Square square = new Square(5);

    public Layer() {
        Thread thread = new Thread(this);
        thread.start();
    }

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

    @Override
    public void paint(Graphics graphics) {
        //circle.draw(graphics);
        rectangle.draw(graphics);
        square.draw(graphics);
    }

    @Override
    public void run() {
        while(true) {
            repaint();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            circle.move();
        }
    }
}
