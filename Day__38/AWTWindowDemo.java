import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.util.*;

class WindowDemo extends Frame implements WindowListener {

    Label l;

    public WindowDemo() {
        super("Window Event Demo");

        l = new Label("             ");
        setLayout(new FlowLayout());
        add(l);

        addWindowListener(this);

    }

    @Override
    public void windowOpened(WindowEvent e) {
        l.setText("Window Opened.");

    }

    @Override
    public void windowClosing(WindowEvent e) {
        l.setText("Window Closing.");
        System.exit(0);

    }

    @Override
    public void windowClosed(WindowEvent e) {
        l.setText("Window Closed.");

    }

    @Override
    public void windowIconified(WindowEvent e) {
        l.setText("Window Iconified.");

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        l.setText("Window Deiconified.");

    }

    @Override
    public void windowActivated(WindowEvent e) {
        l.setText("Window Activated.");

    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        l.setText("Window Deactivated.");

    }
}

public class AWTWindowDemo {
    public static void main(String[] args) {
        WindowDemo s = new WindowDemo();
        s.setSize(500, 500);
        s.setVisible(true);

    }

}
