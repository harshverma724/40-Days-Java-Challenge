import java.awt.*;

public class AWTDemo {
    public static void main(String[] args) {

        Frame f = new Frame("New frame");
        f.setLayout(new FlowLayout());

        Button b = new Button("OK");
        Label l = new Label("Name");
        TextField tf = new TextField(20);

        f.add(l);
        f.add(tf);
        f.add(b);
        f.setSize(1000, 700);
        f.setVisible(true);

    }

}
