import java.awt.*;
import java.awt.event.*;

class MyFrameTwo extends Frame implements ItemListener {

    Label l;
    Checkbox c1, c2, c3;
    CheckboxGroup c;

    public MyFrameTwo() {
        super("Check Box Demo");

        l = new Label("Nothing Selected");

        c = new CheckboxGroup();
        c1 = new Checkbox("Java", false, c);
        c2 = new Checkbox("Python", false, c);
        c3 = new Checkbox("Pearl", false, c);

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

public class AWTDemoFive {

    public static void main(String[] args) {

        MyFrameTwo m = new MyFrameTwo();
        m.setSize(400, 400);
        m.setVisible(true);

    }

}
