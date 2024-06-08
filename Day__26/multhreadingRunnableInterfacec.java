class NewThread implements Runnable {
    public void run() {
        int j = 1;
        while (j < 5) {
            System.out.println(j + "Hello");
            j++;
        }
    }
}

public class multhreadingRunnableInterfacec {
    public static void main(String[] args) {

        NewThread n = new NewThread();
        Thread t = new Thread(n);
        t.start();

        int i = 1;
        while (i < 5) {
            System.out.println(i + "World.");
            i++;
        }

    }

}
