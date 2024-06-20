import java.awt.*;
import java.awt.event.*;

class LayoutDemo extends Frame {

    Button b1, b2, b3, b4, b5, b6;

    public LayoutDemo() {
        super("FLow Layout");

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");

        FlowLayout f1 = new FlowLayout();
        f1.setAlignment(FlowLayout.RIGHT);

        setLayout(f1);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

    }

}

public class AWTLayoutDemo {
    public static void main(String[] args) {

        LayoutDemo s = new LayoutDemo();
        s.setSize(500, 500);
        s.setVisible(true);

    }

}
