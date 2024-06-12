import java.io.*;

public class fileStreamFour {

    public static void main(String[] args) {
        try {
            FileInputStream fr = new FileInputStream("C:/Users/harsh/OneDrive/Desktop/java/FileStream/Source1.txt");
            FileOutputStream fw = new FileOutputStream("C:/Users/harsh/OneDrive/Desktop/java/FileStream/Source2.txt");
            byte b[] = new byte[fr.available()];
            fr.read(b);
            String str = new String(b);

            String s = new String(str.toLowerCase());
            fw.write(s.getBytes());
            System.out.println("Source2 File :" + s);

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }
}
