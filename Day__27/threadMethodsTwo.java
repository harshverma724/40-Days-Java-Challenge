class MyThread extends Thread {
    public MyThread(String name) {
        super(name);

    }

    public void run() {
        int count = 1;
        while (true) {
            try {
                System.out.println(count);
                count++;
                sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class threadMethodsTwo {
    public static void main(String[] args) throws Exception {
        // get methods.
        MyThread m = new MyThread("Harsh Thread 1.");

        m.start();
        m.interrupt();

    }

}
