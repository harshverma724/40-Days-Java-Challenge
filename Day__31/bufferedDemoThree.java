import java.io.*;

public class bufferedDemoThree {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:/Users/harsh/OneDrive/Desktop/java/FileStreamOne/Test.txt");
            BufferedReader bs = new BufferedReader(fr);
            /*
             * System.out.print((char) bs.read());
             * System.out.print((char) bs.read());
             * bs.mark(10);
             * System.out.print((char) bs.read());
             * System.out.print((char) bs.read());
             * bs.reset();
             * System.out.print((char) bs.read());
             */
            System.out.println(bs.readLine());

        } catch (FileNotFoundException e) {

        } catch (IOException e) {
        }

    }

}
