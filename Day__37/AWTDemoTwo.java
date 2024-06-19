import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends Frame {

}

public class AWTDemoTwo extends Frame implements ActionListener {

    Label l;
    Button b;

    int count = 0;

    public AWTDemoTwo() {
        super("My App");

        setLayout(new FlowLayout());

        l = new Label("       " + count);

        b = new Button("Click Here");

        b.addActionListener(this);

        add(l);

        add(b);

    }

    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("       " + count);
    }

    public static void main(String[] args) {

        AWTDemoTwo mf = new AWTDemoTwo();
        mf.setSize(700, 700);
        mf.setVisible(true);

    }

}
