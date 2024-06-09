class MyNewThread extends Thread {

    public void run() {
        int count = 1;
        while (true) {

            System.out.println(count);
            count++;

        }
    }
}

public class threadMethodsFour {
    public static void main(String[] args) {

        MyNewThread m = new MyNewThread();
        m.setDaemon(true);
        m.start();
        Thread mainth = Thread.currentThread();
        try {
            mainth.join();
        } catch (Exception e) {
        }

    }
}
