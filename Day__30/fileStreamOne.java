import java.io.*;

public class fileStreamOne {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("C:/Users/harsh/OneDrive/Desktop/java/FileStream/Harsh.txt");
            byte b[] = new byte[fs.available()];
            fs.read(b);
            String str = new String(b);
            System.out.println(str);
        } catch (FileNotFoundException e) {
        } catch (IOException e) {

        }

        System.out.print("Program Executed.");

    }
}
