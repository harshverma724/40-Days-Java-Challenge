import java.io.*;

public class bufferedDemoOne {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("C:/Users/harsh/OneDrive/Desktop/java/FileStreamOne/Test.txt");
            BufferedInputStream bs = new BufferedInputStream(fi);
            System.out.println("File: " + fi.markSupported());
            System.out.println("Buffer: " + bs.markSupported());

        } catch (FileNotFoundException e) {

        } catch (IOException e) {
        }

    }

}
