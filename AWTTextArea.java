import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AWTTextArea extends Frame implements ActionListener {

    TextArea ta;
    Button b;

    Label l;
    TextField tf;

    public AWTTextArea() {
        super("TextArea Demo");

        l = new Label("No Text Entered");
        ta = new TextArea(10, 30);
        tf = new TextField(20);
        b = new Button("Click");

        setLayout(new FlowLayout());

        add(tf);
        add(l);
        add(b);
        add(ta);

        b.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // ta.append(tf.getText());
        // l.setText(ta.getSelectedText());
        ta.insert(tf.getText(), ta.getCaretPosition());
    }

    public static void main(String[] args) {

        AWTTextArea n = new AWTTextArea();
        n.setSize(400, 400);
        n.setVisible(true);
    }

}