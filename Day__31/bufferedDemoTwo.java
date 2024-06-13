import java.io.*;

public class bufferedDemoTwo {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("C:/Users/harsh/OneDrive/Desktop/java/FileStreamOne/Test.txt");
            BufferedInputStream bs = new BufferedInputStream(fi);

            System.out.print((char) bs.read());
            System.out.print((char) bs.read());
            bs.mark(10);
            System.out.print((char) bs.read());
            System.out.print((char) bs.read());
            bs.reset();
            System.out.print((char) bs.read());

        } catch (FileNotFoundException e) {

        } catch (IOException e) {
        }

    }

}
