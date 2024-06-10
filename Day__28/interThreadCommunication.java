class MyData {
    int value;
    boolean flag = true;

    synchronized public void setValue(int x) {

        while (flag != true) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        value = x;
        flag = false;
        notify();

    }

    synchronized public int getValue() {
        int x = 0;

        while (flag != false) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        x = value;
        flag = true;
        notify();
        return x;

    }

}

class Producer extends Thread {
    MyData data;

    public Producer(MyData d) {
        data = d;
    }

    public void run() {
        int count = 1;
        while (count < 10) {
            data.setValue(count);
            System.out.println("Producer: " + count);
            count++;
        }
    }
}

class Consumer extends Thread {
    MyData data;

    public Consumer(MyData d) {
        data = d;
    }

    public void run() {
        int s = 1;
        int value;
        while (s < 10) {
            value = data.getValue();
            System.out.println("Consumer: " + value);
            s++;

        }
    }
}

public class interThreadCommunication {

    public static void main(String[] args) {
        MyData m = new MyData();
        Producer p = new Producer(m);
        Consumer c = new Consumer(m);

        p.start();
        c.start();

    }

}
