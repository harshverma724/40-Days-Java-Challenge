import java.io.*;

public class byteDemo {
    public static void main(String[] args) {
        try {
            byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'i', 'j', 'k' };
            ByteArrayInputStream bs = new ByteArrayInputStream(b);

            int x;
            while ((x = bs.read()) != -1) {
                System.out.print((char) x);
            }
            bs.close();

        } catch (IOException e) {
        }

    }

}
