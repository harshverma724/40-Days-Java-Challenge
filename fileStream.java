import java.io.*;

public class fileStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fs = new FileOutputStream("C:/Users/harsh/OneDrive/Desktop/java/FileStream/Harsh.txt");
            String str = "Harsh Verma Programming Journey";
            fs.write(str.getBytes());
            fs.close();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
        System.out.print("Program Executed.");

    }

}
