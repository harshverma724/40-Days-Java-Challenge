import java.io.*;

public class fileStreamFive {
    public static void main(String[] args) {
        try {
            FileInputStream fr = new FileInputStream("C:/Users/harsh/OneDrive/Desktop/java/FileStream/Source1.txt");
            FileInputStream fr1 = new FileInputStream("C:/Users/harsh/OneDrive/Desktop/java/FileStream/Source2.txt");
            FileOutputStream fw = new FileOutputStream(
                    "C:/Users/harsh/OneDrive/Desktop/java/FileStream/Destination.txt");
            byte b[] = new byte[fr.available()];
            fr.read(b);
            String str = new String(b);

            byte b1[] = new byte[fr1.available()];
            fr1.read(b1);
            String str1 = new String(b1);
            String dest = str + str1;

            fw.write(dest.getBytes());
            // System.out.println("Source2 File :" + str);

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }
}
