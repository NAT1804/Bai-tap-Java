package tutorial;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Image extends JFrame {
    public Image() {
        this.setSize(400, 250);
        this.setVisible(true);
        this.setLocation(500, 300);
        this.setTitle("Image");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        add(label);
        label.setSize(350, 200);
        setPicture(label, "deathstroke3.jpg");
    }

    public void setPicture(JLabel label, String file_name) {
        try {
            BufferedImage image = ImageIO.read(new File(file_name));
            int x = label.getSize().width;
            int y = label.getSize().height;
            int ix = image.getWidth();
            int iy = image.getHeight();
            int dx = 0;
            int dy = 0;
            if((float)x/y > (float)ix/iy) {
                dy = y;
                dx = dy*ix/iy;
            } else {
                dx = x;
                dy = dx*iy/ix;
            }
            ImageIcon icon = new ImageIcon(image.getScaledInstance(dx, dy, image.SCALE_SMOOTH));
            label.setIcon(icon);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)  {
        new Image();
    }
}
