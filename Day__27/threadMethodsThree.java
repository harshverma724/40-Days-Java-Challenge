class MyNewThread extends Thread {

    public void run() {
        int count = 1;
        while (true) {

            System.out.println(count);
            count++;

        }
    }
}

public class threadMethodsThree {
    public static void main(String[] args) {

        MyNewThread m = new MyNewThread();
        m.setDaemon(true);
        m.start();
        try {
            MyThread.sleep(100);
        } catch (Exception e) {
        }

    }

}
