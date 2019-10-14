package tutorial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JFrame implements ActionListener {

    private JLabel label;
    private JButton button;
    private JButton button1;

    public Button() {

        label = new JLabel("Hello");
        label.setSize(50, 20);
        add(label);
        button = new JButton("click");
        add(button, "North", 1);
        button.addActionListener(this);

        button1 = new JButton("click");
        add(button1, "South", 1);
        button1.addActionListener(this);

        // setup Frame
        this.setSize(400, 250);
        this.setVisible(true);
        this.setLocation(500, 300);
        this.setTitle("Button");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if (b == button1) label.setText("Tutorials2");
        if (b == button) label.setText("Tutorials1");
    }

    public static void main(String[] args) {
        new Button();
    }
}
