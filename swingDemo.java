import java.util.concurrent.Flow;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class NewFrame extends JFrame implements ActionListner {

    JLabel l;
    JButton b;
    int count = 0;

    public NewFrame() {
        super("String Demo");

        l = new JLabel("Clicked " + count + " Times");
        b = new JButton("Click");

        setLayout(new FlowLayout());

        add(l);
        add(b);

        add(new JButton("Click"));

        // b.addActionListener(this);

        getRootPane().setDefaultButton(b);

        b.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\IMG_20230415_112335.jpg"));
        l.setToolTipText("Counter");
    }

    public void actionPerformed() {
        count++;
        l.setText("Clicked " + count + " Times");
    }

}

public class swingDemo {
    public static void main(String[] args) {

        NewFrame n = new NewFrame();
        n.setSize(500, 500);
        n.setVisible(true);

        n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
