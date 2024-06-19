import java.awt.*;
import java.awt.event.*;

class MyFrameOne extends Frame implements ItemListener {

    Label l;
    Checkbox c1, c2, c3;

    public MyFrameOne() {
        super("Check Box Demo");

        l = new Label("Nothing Selected");
        c1 = new Checkbox("Java");
        c2 = new Checkbox("Python");
        c3 = new Checkbox("Pearl");

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setLayout(new FlowLayout());

        add(l);
        add(c1);
        add(c2);
        add(c3);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String s = "";
        if (c1.getState()) {
            s = s + " " + c1.getLabel();

        }
        if (c2.getState()) {
            s = s + " " + c2.getLabel();

        }
        if (c3.getState()) {
            s = s + " " + c3.getLabel();
        }

        l.setText(s);

    }

}

public class AWTDemoFour {

    public static void main(String[] args) {

        MyFrameOne m = new MyFrameOne();
        m.setSize(400, 400);
        m.setVisible(true);

    }

}
