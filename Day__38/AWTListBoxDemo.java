import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;;

class DemoList extends Frame implements ItemListener, ActionListener {

    List l;
    Choice c;
    TextArea ta;

    public DemoList() {
        l = new List(4, true);
        c = new Choice();
        ta = new TextArea(20, 30);

        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);

        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if (e.getSource() == l) {
            ta.setText(l.getSelectedItem());
        }
        if (e.getSource() == c) {
            ta.setText(c.getSelectedItem());
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String list[] = l.getSelectedItems();
        String txt = " ";
        for (String x : list) {
            txt += x + "\n";
            ta.setText(txt);
        }

    }

}

public class AWTListBoxDemo {
    public static void main(String[] args) {

        DemoList d = new DemoList();
        d.setSize(400, 400);
        d.setVisible(true);

    }

}
