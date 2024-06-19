import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTDemoThree extends Frame implements ActionListener {

    Label l;
    Button b;
    Button b1;

    public AWTDemoThree() {
        super("My App");

        setLayout(new FlowLayout());

        l = new Label("                       ");

        b = new Button("Click for Java.");
        b1 = new Button("Click for Python.");

        b.addActionListener(this);
        b1.addActionListener(this);

        add(b);
        add(l);
        add(b1);

    }

    public void actionPerformed(ActionEvent e) {
        String s = "";
        if (e.getSource() == b) {
            s = "Java";

        }

        else {
            s = "Pyhton";
        }

        l.setText(s);
    }

    public static void main(String[] args) {

        System.out.println("Application Starting.");

        AWTDemoThree mf = new AWTDemoThree();
        mf.setSize(700, 700);
        mf.setVisible(true);

    }

}