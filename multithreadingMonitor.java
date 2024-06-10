class MyThread1 extends Thread {

    New n;

    public MyThread1(New n) {
        this.n = n;
    }

    public void run() {
        n.display("Hellow World.");

    }

}

class MyThread2 extends Thread {

    New n;

    public MyThread2(New n) {
        this.n = n;
    }

    public void run() {
        n.display("Welcome.");

    }

}

class New {

    synchronized public void display(String a) {

        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt(i));
        }
    }
}

public class multithreadingMonitor {
    public static void main(String[] args) {
        New n = new New();
        MyThread1 t1 = new MyThread1(n);
        MyThread2 t2 = new MyThread2(n);

        t1.start();
        t2.start();

    }

}
