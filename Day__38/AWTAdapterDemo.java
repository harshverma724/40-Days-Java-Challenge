import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.util.*;

class MyWindowAdaper extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class AdapterDemo extends Frame {

    public AdapterDemo() {
        super("Adapter Demo");
        addWindowListener(new MyWindowAdaper());
    }

}

public class AWTAdapterDemo {
    public static void main(String[] args) {

        AdapterDemo a = new AdapterDemo();
        a.setSize(500, 500);
        a.setVisible(true);

    }

}
