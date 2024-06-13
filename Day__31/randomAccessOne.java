import java.io.*;

public class randomAccessOne {
    public static void main(String[] args) throws Exception {
        RandomAccessFile r = new RandomAccessFile("C:/Users/harsh/OneDrive/Desktop/java/FileStreamOne/Random Demo.txt",
                "rw");

        int x;
        while ((x = r.read()) != -1) {
            System.out.println((char) x);
        }

    }

}
