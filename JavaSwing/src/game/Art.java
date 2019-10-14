package game;

import javax.swing.*;
import java.awt.*;

public class TapVe extends JPanel implements Runnable{
    public TapVe() {
        Thread thread = new Thread(this);
        thread.start();
    }
    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect(0, 0, getWidth() ,getHeight());
        g.setColor(Color.green);
        g.fillRect(0, 500, getWidth(), getHeight());
        g.setColor(Color.orange);
        g.fillRect(0, 520, getWidth(), getHeight());
    }

    @Override
    public void run() {

    }
}
