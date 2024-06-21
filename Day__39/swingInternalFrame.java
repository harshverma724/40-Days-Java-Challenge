import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class MyInternalFrame extends JInternalFrame {

    static int count = 0;
    JTextArea ta;
    JScrollPane sp;

    MyInternalFrame() {
        super("Document" + (++count), true, true, true, true);
        ta = new JTextArea();
        sp = new JScrollPane(ta);
        add(sp);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1 = new JMenuItem("Save");

        file.add(m1);
        mb.add(file);
        setJMenuBar(mb);

        setSize(300, 300);
        setLocation(50, 50);
        setVisible(true);
    }

}

class InternalFrame extends JFrame implements ActionListener {

    JDesktopPane jp;

    InternalFrame() {
        super("Internal Frame");

        jp = new JDesktopPane();
        setContentPane(jp);

        JMenuBar mb = new JMenuBar();
        JMenu d = new JMenu("Document");
        JMenuItem m1 = new JMenuItem("New");

        d.add(m1);
        mb.add(d);
        setJMenuBar(mb);

        m1.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        MyInternalFrame mi = new MyInternalFrame();
        jp.add(mi);

    }

}

public class swingInternalFrame {
    public static void main(String[] args) {

        InternalFrame n = new InternalFrame();
        n.setSize(500, 500);
        n.setVisible(true);
        n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
