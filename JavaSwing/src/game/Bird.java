package game;

import javax.swing.*;
import java.awt.*;

public class Bird extends JPanel {
    private static int y = 200;
    private static int x = 100;

    public int getY() {
        return y;
    }

    public void draw(Graphics graphics) {
        graphics.setColor(Color.red);
        graphics.fillRect(x, y, 40, 40);
    }
    public void increaseY() { // bay xuong
        y++;
    }
    public void decreaseY() { // bay len
        y-=70;
    }
}
