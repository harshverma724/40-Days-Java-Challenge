import java.io.*;

public class byteDemoThree {
    public static void main(String[] args) {
        try {

            ByteArrayOutputStream bs = new ByteArrayOutputStream(20);
            bs.write('H');
            bs.write('a');
            bs.write('r');
            bs.write('s');
            bs.write('h');

            byte b[] = bs.toByteArray();
            bs.writeTo(new FileOutputStream("C:/Users/harsh/OneDrive/Desktop/java/FileStream/New.txt.txt"));

        } catch (IOException e) {
        }

    }

}
