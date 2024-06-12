import java.io.*;

public class byteDemoTwo {
    public static void main(String[] args) {
        try {
            byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'i', 'j', 'k' };
            ByteArrayInputStream bs = new ByteArrayInputStream(b);
            System.out.println(bs.markSupported());
            bs.close();

        } catch (IOException e) {
        }

    }

}
