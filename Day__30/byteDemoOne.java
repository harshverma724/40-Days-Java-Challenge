import java.io.*;

public class byteDemoOne {
    public static void main(String[] args) {
        try {
            byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'i', 'j', 'k' };
            ByteArrayInputStream bs = new ByteArrayInputStream(b);
            String str = new String(bs.readAllBytes());
            System.out.println(str);

            bs.close();

        } catch (IOException e) {
        }

    }

}
