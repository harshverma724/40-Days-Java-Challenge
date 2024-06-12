import java.io.*;

public class byteDemoFour {
    public static void main(String[] args) {
        try {
            char b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'i', 'j', 'k' };
            CharArrayReader bs = new CharArrayReader(b);

            int x;
            while ((x = bs.read()) != -1) {
                System.out.print((char) x);
            }

            bs.close();
        } catch (IOException e) {
        }

    }

}
