import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

import javax.imageio.stream.FileImageInputStream;
import javax.swing.*;
import java.util.*;

class MenuTool extends JFrame implements ActionListener {

    JToolBar tb;
    JButton b1, b2, b3, b4, b5, b6, b7;

    JTextArea ta;

    public MenuTool() {
        tb = new JToolBar();

        b1 = new JButton(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\java\\Icons\\bear_1_10.png"));
        b2 = new JButton(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\java\\Icons\\chatting_10.png"));
        b3 = new JButton(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\java\\Icons\\crocodile_10.png"));
        b4 = new JButton(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\java\\Icons\\dumbbell_1_10.png"));
        b5 = new JButton(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\java\\Icons\\have-a-nice-day_10.png"));
        b6 = new JButton(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\java\\Icons\\lion_10.png"));
        b7 = new JButton(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\java\\Icons\\listening_10.png"));
        tb.add(b1);
        tb.add(b2);
        tb.add(b3);
        tb.add(new JToolBar.Separator());
        tb.add(b4);
        tb.add(b5);
        tb.add(b6);
        tb.add(b7);

        ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);

        add(tb, BorderLayout.NORTH);
        add(sp, BorderLayout.CENTER);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1 = new JMenuItem("Save");
        JMenuItem m2 = new JMenuItem("Open");

        m2.setMnemonic(KeyEvent.VK_O);

        file.add(m1);
        file.addSeparator();
        file.add(m2);
        mb.add(file);
        setJMenuBar(mb);

        b2.setActionCommand("Open");
        b2.addActionListener(this);
        m2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        File f = fc.getSelectedFile();
        try {
            FileInputStream fi = new FileInputStream(f);
            byte[] b = new byte[fi.available()];
            fi.read(b);
            String str = new String(b);
            ta.setText(str);
            fi.close();

        } catch (Exception e) {

        }

    }

}

public class swingMenuTool {
    public static void main(String[] args) {
        MenuTool n = new MenuTool();
        n.setSize(600, 500);
        n.setVisible(true);
        n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
