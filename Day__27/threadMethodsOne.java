import java.lang.*;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
}

public class threadMethodsOne {
    public static void main(String[] args) throws Exception {
        // get methods.
        MyThread m = new MyThread("Harsh Thread 1.");

        try {

            // System.out.println(m.getId());
            System.out.println(m.getName());
            System.out.println(m.getPriority());
            m.start();
            System.out.println(m.isAlive());

            System.out.println(m.getState());
        } catch (Exception e) {
            System.out.println("Exception hai.");
        }

    }

}
