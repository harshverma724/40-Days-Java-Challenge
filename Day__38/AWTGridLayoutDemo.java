
import java.awt.*;
import java.awt.event.*;

class GridDemoOne extends Frame {

    Button b1, b2, b3, b4, b5, b6;

    public GridDemoOne() {
        super("GridLayout");

        setLayout(new GridLayout(3, 2));

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

    }

}

public class AWTGridLayoutDemo {
    public static void main(String[] args) {

        GridDemoOne s = new GridDemoOne();
        s.setSize(500, 500);
        s.setVisible(true);

    }

}
