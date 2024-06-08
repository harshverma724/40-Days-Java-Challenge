public class multhreadingRunnableInterfacecOne implements Runnable {
    public void run() {
        int i = 1;
        while (i < 5) {
            System.out.println(i + "Harsh");
            i++;
        }
    }

    // MultiThreading in Single Class Using Runnable Interface.

    public static void main(String[] args) {

        multhreadingRunnableInterfacecOne m = new multhreadingRunnableInterfacecOne();
        Thread t = new Thread(m);
        t.start();

        int j = 1;
        while (j < 5) {
            System.out.println(j + "Verma.");
            j++;

        }

    }

}
