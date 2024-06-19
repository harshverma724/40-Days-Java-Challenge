import java.awt.*;

class MyFrame extends Frame {

}

public class AWTDemoOne extends Frame {

    Label l;
    Button b;
    TextField tf;

    public AWTDemoOne() {
        super("My App");

        setLayout(new FlowLayout());

        l = new Label("Name");
        tf = new TextField(20);
        b = new Button("OK");

        add(l);
        add(tf);
        add(b);

    }

    public static void main(String[] args) {

        AWTDemoOne mf = new AWTDemoOne();
        mf.setSize(700, 700);
        mf.setVisible(true);

    }

}
