package game;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Window extends JFrame {

    private Art backgound = new Art();
    private Bird bird = new Bird();

    public Window() {
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(400, 200);
        setResizable(false);
        add(backgound);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                bird.decreaseY(); // bam phim de bay len
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                bird.decreaseY(); // click de bay len
            }
        });
    }

    public static void main(String[] args) {
        Window s = new Window();
    }
}
