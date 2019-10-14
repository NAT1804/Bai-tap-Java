import javax.swing.*;

public class Window extends JFrame {

    private Layer layer = new Layer();

    public Window() {
        setSize(600, 600);
        setTitle("Moving Ball");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(400, 200);
        setResizable(false);
        add(layer);
    }

    public static void main(String[] args) {
        Window s = new Window();
    }
}
