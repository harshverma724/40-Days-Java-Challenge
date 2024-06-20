import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.util.*;
import java.util.concurrent.Flow;

class AnimationDemo extends Frame implements Runnable {
    int x, y, tx, ty;

    AnimationDemo() {
        int x = 100;
        int y = 100;
        tx = ty = 1;

        Thread t = new Thread();

        t.start();

    }

    public void paint(Graphics g) {

        g.drawOval(x, y, 50, 50);

    }

    @Override
    public void run() {
        while (true) {
            x += tx;
            y += ty;

            if (x < 0 || x > 450) {
                tx = tx * -1;

            }
            if (y < 0 || y > 450) {
                ty = ty * -1;
                repaint();
            }
        }

    }
}

public class AWTAnimation {

    public static void main(String[] args) {
        AnimationDemo a = new AnimationDemo();
        a.setSize(500, 500);
        a.setVisible(true);

    }

}
