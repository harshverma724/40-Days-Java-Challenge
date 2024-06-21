import java.awt.FlowLayout;
import java.text.*;
import java.util.Locale;

import javax.swing.*;
import javax.swing.text.NumberFormatter;

class formatted extends JFrame {

    formatted() {

        JTextField tf = new JTextField(15);
        SimpleDateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
        JFormattedTextField tf1 = new JFormattedTextField(df);
        tf1.setColumns(15);
        tf1.setValue(0);

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter nft = new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        nft.setMaximum(10000);
        JFormattedTextField tf2 = new JFormattedTextField(nft);
        tf2.setColumns(15);
        tf2.setValue(0);

        setLayout(new FlowLayout());
        add(tf);
        add(tf1);
        add(tf2);

    }
}

public class swingFormattedText {
    public static void main(String[] args) {

        formatted n = new formatted();
        n.setSize(500, 500);
        n.setVisible(true);
        n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
