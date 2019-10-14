package tutorial;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() {
        setSize(600, 600);
        setVisible(true);
        setLocation(500, 90);
        setResizable(false);
        JLabel label = new JLabel();
        add(label);

        label.setText("VietNam");
        label.setToolTipText("Beautiful country");
        label.setForeground(Color.blue);
    }

    public static void main(String[] args) {
        new Frame();
    }
}
