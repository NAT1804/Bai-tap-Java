import javax.swing.*;

public class Window extends JFrame {
    static int width = 600;;
    static int height = 400;
    public Window() {
        setSize(width, height);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(400, 200);
    }

    public static void main(String[] args) {
        Window s = new Window();
    }
}
