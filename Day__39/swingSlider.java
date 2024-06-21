import java.awt.BorderLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Slider extends JFrame implements ChangeListener {

    JSlider sl;
    JPanel p1, p2;
    JProgressBar pb;

    int w = 50;

    public Slider() {
        // Initialize the slider with min, max, and initial values
        sl = new JSlider(0, 100, 50);
        sl.setMajorTickSpacing(10);
        sl.setMinorTickSpacing(1);
        sl.setPaintTicks(true);
        sl.setPaintLabels(true);

        // Initialize the progress bar
        pb = new JProgressBar();
        pb.setString("50%");
        pb.setStringPainted(true);

        // Initialize the panel for drawing the oval
        p1 = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g); // Ensure proper painting
                int x = (getWidth() - w) / 2;
                int y = (getHeight() - w) / 2;
                g.drawOval(x, y, w, w);
            }
        };

        // Initialize the panel for the progress bar
        p2 = new JPanel();
        p2.add(pb);

        // Add components to the frame
        add(sl, BorderLayout.NORTH);
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        // Add the change listener to the slider
        sl.addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        // Update the oval's width and repaint the panel
        w = sl.getValue();
        p1.repaint();

        // Update the progress bar
        pb.setString(w + "%");
        pb.setValue(w);
    }
}

public class swingSlider {
    public static void main(String[] args) {
        Slider n = new Slider();
        n.setSize(500, 500);
        n.setVisible(true);
        n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
