import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class Checkbox extends JFrame implements ActionListner, ActionListener {

    JCheckBox c1, c2;
    JRadioButton r1, r2;
    JTextField tf;

    Checkbox() {
        super("Demo");

        tf = new JTextField("Demo Text", 20);
        tf.setBounds(10, 20, 100, 80);

        c1 = new JCheckBox("Bold");
        c1.setMnemonic(KeyEvent.VK_B);

        c2 = new JCheckBox("Italic");
        c2.setMnemonic(KeyEvent.VK_I);

        r1 = new JRadioButton("Lower");
        r2 = new JRadioButton("Upper");

        ButtonGroup bg = new ButtonGroup();

        bg.add(r1);
        bg.add(r2);

        c1.addActionListener(this);
        c2.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);

        r1.setActionCommand("Lower");
        r2.setActionCommand("Upper");

        setLayout(new FlowLayout());
        add(tf);
        add(c1);
        add(c2);
        add(r1);
        add(r2);

    }

    public void actionPerformed(ActionEvent ae) {

        switch (ae.getActionCommand()) {
            case "Lower":
                tf.setText(tf.getText().toLowerCase());
                break;

            case "Upper":
                tf.setText(tf.getText().toUpperCase());
                break;
        }

        int b = 0, i = 0;
        if (c1.isSelected()) {
            b = Font.BOLD;

        }
        if (c2.isSelected()) {
            i = Font.ITALIC;
        }

        Font f = new Font("Times New Roman", b | i, 15);
        tf.setFont(f);
    }

}

public class swingCheckbox {
    public static void main(String[] args) {
        Checkbox n = new Checkbox();
        n.setSize(500, 500);
        n.setVisible(true);
        n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
