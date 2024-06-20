import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.util.*;
import java.util.concurrent.Flow;

class EventHandling extends Frame {

    TextField tf;
    Button b;
    int count = 0;

    public EventHandling() {
        super("Event Handling");

        tf = new TextField("0");
        b = new Button("Click");

        setLayout(new FlowLayout());

        add(tf);
        add(b);

        b.addActionListener(new Mylistener());

    }

    class Mylistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            count++;
            tf.setText("" + count);

        }
    }

}

public class AWTEventHandlingDemo {
    public static void main(String[] args) {

        EventHandling a = new EventHandling();
        a.setSize(500, 500);
        a.setVisible(true);

    }

}
