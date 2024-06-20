import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.util.*;
import java.util.concurrent.Flow;

class Painting extends Frame {
    int x = 0, y = 0;

    Painting() {
        super("Painting Demo");

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                x = me.getX();
                y = me.getY();

                repaint();
            }
        });

    }

    public void paint(Graphics g) {

        g.setColor(Color.RED);
        g.drawOval(x, y, 50, 50);
    }
}

public class AWTPaintingDemo {
    public static void main(String[] args) {
        Painting a = new Painting();
        a.setSize(500, 500);
        a.setVisible(true);
    }

}
