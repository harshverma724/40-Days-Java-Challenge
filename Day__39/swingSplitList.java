import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class SplitList extends JFrame implements ListSelectionListener {

    JSplitPane sp;
    JList list;
    JLabel lbl;

    SplitList() {
        super("Split Demo");

        String cols[] = { "Red", "Green", "Blue", "Pink" };
        list = new JList<>(cols);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        JScrollPane p1 = new JScrollPane(list);

        lbl = new JLabel(" ");
        lbl.setOpaque(true);
        lbl.setBackground(Color.ORANGE);
        JScrollPane p2 = new JScrollPane(lbl);
        sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p1, p2);
        sp.setDividerLocation(150);

        add(sp);

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

        String str = (String) list.getSelectedValue();
        switch (str) {
            case "Red":
                lbl.setBackground(Color.RED);
                break;
            case "Green":
                lbl.setBackground(Color.GREEN);
                break;
            case "Blue":
                lbl.setBackground(Color.BLUE);
                break;
            case "Pink":
                lbl.setBackground(Color.PINK);
                break;
        }
    }

}

public class swingSplitList {
    public static void main(String[] args) {

        SplitList n = new SplitList();
        n.setSize(500, 500);
        n.setVisible(true);
        n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
