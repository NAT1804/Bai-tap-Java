package game;

import javax.swing.*;
import java.awt.*;

public class Art extends JPanel implements Runnable{

    private Bird bird = new Bird();
    private Column column = new Column();
    private Check check = new Check();

    StopThread thread;

    public Art() {
        thread = new StopThread();
        thread.start();
    }
    public void paint(Graphics graphics) {
        graphics.setColor(Color.cyan);
        graphics.fillRect(0, 0, getWidth() ,getHeight());
        column.draw(graphics);
        graphics.setColor(Color.green);
        graphics.fillRect(0, 500, getWidth(), getHeight());
        graphics.setColor(Color.orange);
        graphics.fillRect(0, 510, getWidth(), getHeight());
        bird.draw(graphics);
    }

    @Override
    public void run() {
        while(true) {
            repaint();
            column.decreaseX();
            try {
                Thread.sleep(5); // chuong trinh ngung 5 miliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            column.repeat();
            bird.increaseY();
            if(check.lose()) thread.interrupt();
        }
    }
}
