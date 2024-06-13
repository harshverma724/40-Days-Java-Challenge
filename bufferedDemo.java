import java.io.*;

public class bufferedDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("C:/Users/harsh/OneDrive/Desktop/java/FileStreamOne/Test.txt");
            BufferedInputStream bs = new BufferedInputStream(fi);

            int x;
            while ((x = bs.read()) != -1) {
                System.out.print((char) x);
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
        }

    }

}
