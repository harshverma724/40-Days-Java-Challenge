class MyThread extends Thread {
    public void run() {
        int j = 1;
        while (j < 4) {
            System.out.println(j + "Hello");
            j++;
        }
    }
}

public class multithreading {

    // MultiThreading using Different Classes.
    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.start();

        int i = 1;
        while (i < 4) {
            System.out.println(i + "World");
            i++;
        }

    }

}
