package game;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Column extends JPanel {
    private static int x1 = 600;
    private static int x2 = x1 + 160;
    private static int x3 = x2 + 160;
    private static int x4 = x3 + 160;
    private int h1, h2, h3, h4;
    private static boolean check1 = false;
    private static boolean check2 = false;
    private static boolean check3 = false;
    private static boolean check4 = false;

    public void rand() {
        Random random = new Random();
        if (!check1) {
            h1 = random.nextInt(200); // h1 ngau nhien tu 0 den 199
            check1 = true;
        }
        if (!check2) {
            h2 = random.nextInt(200); // h2 ngau nhien tu 0 den 199
            check2 = true;
        }
        if (!check3) {
            h3 = random.nextInt(200); // h3 ngau nhien tu 0 den 199
            check3 =true;
        }
        if (!check4) {
            h4 = random.nextInt(200); // h4 ngau nhien tu 0 den 199
            check4 = true;
        }
    }

    public void draw(Graphics graphics) {

        rand();

        graphics.setColor(Color.green);
        graphics.fillRect(x1, 0, 50, h1);
        graphics.setColor(Color.green);
        graphics.fillRect(x1, h1+150, 50, 600);

        graphics.setColor(Color.green);
        graphics.fillRect(x2, 0, 50, h2);
        graphics.setColor(Color.green);
        graphics.fillRect(x2, h2+150, 50, 600);

        graphics.setColor(Color.green);
        graphics.fillRect(x3, 0, 50, h3);
        graphics.setColor(Color.green);
        graphics.fillRect(x3, h3+150, 50, 600);

        graphics.setColor(Color.green);
        graphics.fillRect(x4, 0, 50, h4);
        graphics.setColor(Color.green);
        graphics.fillRect(x4, h4+150, 50, 600);
    }
    public void decreaseX() {
        x1--;
        x2--;
        x3--;
        x4--;
    }
    public void repeat() {
        if (x1 == -50) {
            x1 = 600;
            check1 = false;
        }
        if (x2 == -50) {
            x2 = 600;
            check2 = false;
        }
        if (x3 == -50) {
            x3 = 600;
            check3 = false;
        }
        if (x4 == -50) {
            x4 = 600;
            check4 = false;
        }
    }
}
