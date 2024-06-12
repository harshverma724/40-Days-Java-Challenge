import java.io.*;

public class fileStreamTwo {
    public static void main(String[] args) {
        try {
            FileReader fs = new FileReader("C:/Users/harsh/OneDrive/Desktop/java/FileStream/Harsh.txt");

            int x;
            while ((x = fs.read()) != -1) {
                System.out.print((char) x);
            }

        } catch (FileNotFoundException e) {

        } catch (IOException e) {
        }

    }

}
