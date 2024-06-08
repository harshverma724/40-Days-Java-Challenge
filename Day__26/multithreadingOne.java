public class multithreadingOne extends Thread {

    // MultiThreading in Single Class.

    public void run() {
        int i = 1;
        while (i < 5) {
            System.out.println(i + "Hello");
            i++;
        }
    }

    public static void main(String[] args) {

        multithreadingOne m = new multithreadingOne();
        m.start();

        int j = 1;
        while (j < 5) {
            System.out.println(j + " World.");
            j++;

        }

    }

}
