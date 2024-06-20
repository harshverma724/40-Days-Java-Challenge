
import java.awt.*;
import java.awt.event.*;

class LayoutDemoOne extends Frame {

    Button b1, b2, b3, b4, b5, b6;

    public LayoutDemoOne() {
        super("FLow Layout");

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");

        add(b1, BorderLayout.NORTH);
        // add(b2, BorderLayout.EAST);
        add(b3, BorderLayout.SOUTH);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);

        Panel p = new Panel();
        p.setLayout(new GridLayout(3, 1));
        p.add(new Button("Mon"));
        p.add(new Button("Tue"));
        p.add(new Button("Wed"));

        add(p, BorderLayout.EAST);
        // add(b6,BorderLayout.NORTH);

    }

}

public class BorderLayoutDemo {
    public static void main(String[] args) {

        LayoutDemoOne s = new LayoutDemoOne();
        s.setSize(500, 500);
        s.setVisible(true);

    }

}
