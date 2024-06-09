
class MyNewThread extends Thread {

    public void run() {
        int count = 1;
        while (true) {

            System.out.println(count + "Harsh's Thread.");
            count++;

        }
    }
}

public class threadMethodsFive {
    public static void main(String[] args) {
        MyNewThread m = new MyNewThread();

        m.start();

        int count = 1;
        while (true) {

            System.out.println(count + "Harsh's Main Thread.");
            count++;
            Thread.yield();

        }

    }

}
