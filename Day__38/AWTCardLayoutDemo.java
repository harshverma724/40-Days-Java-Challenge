import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.util.*;

class CardLayout extends Frame implements ItemListener {
    Button b1, b2, b3;
    TextField t1, t2, t3;

    Panel p1, p2, cp, mainp;

    Checkbox c1, c2;

    CardLayout cl;

    public CardLayout() {

        super("CardLayout Demo");

        Checkbox cbg = new Checkbox();

        c1 = new Checkbox("One", true);
        c2 = new Checkbox("Two", false);

        c1.addItemListener(this);
        c2.addItemListener(this);

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        cp = new Panel();
        cp.add(c1);
        cp.add(c2);

        p1 = new Panel();

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2 = new Panel();

        p2.add(t1);
        p2.add(t2);
        p2.add(t3);

        mainp = new Panel();
        cl = new CardLayout();
        mainp.setLayout(cl);

        mainp.add("One", p1);
        mainp.add("Two", p2);

        add(cp, BorderLayout.NORTH);
        add(mainp, BorderLayout.CENTER);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if (c1.getState()) {
            cl.first(mainp);

        } else
            c1.last(mainp);
    }

}

public class AWTCardLayoutDemo {
    public static void main(String[] args) {
        CardLayout c = new CardLayout();
        c.setSize(500, 500);
        c.setVisible(true);

    }

}
