import java.awt.*;
import java.awt.event.*;

class MyFrameThree extends Frame implements TextListener, ActionListener {
    Label l1, l2;
    TextField tf;

    MyFrameThree() {
        super("Text Field Demo");
        l1 = new Label("No Text Entered. TextField is Blank.");
        tf = new TextField(20);
        l2 = new Label("Enter key is not yet hit.");

        // tf.setEchoChar('*');
        tf.addTextListener(this);
        tf.addActionListener(this);

        setLayout(new FlowLayout());

        add(l1);
        add(tf);
        add(l2);

    }

    @Override
    public void textValueChanged(TextEvent e) {
        l1.setText(tf.getText());

    }

    public void actionPerformed(ActionEvent e) {
        l2.setText(tf.getText());
    }
}

public class AWTDemoSix {
    public static void main(String[] args) {

        MyFrameThree m = new MyFrameThree();
        m.setSize(400, 400);
        m.setVisible(true);

    }

}
