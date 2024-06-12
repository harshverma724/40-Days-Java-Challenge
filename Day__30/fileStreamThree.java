import java.io.*;

public class fileStreamThree {
    public static void main(String[] args) {
        try {
            FileWriter fs = new FileWriter("C:/Users/harsh/OneDrive/Desktop/java/FileStream/HarshOne.txt");
            fs.write("Harsh");
            fs.close();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
        }

    }

}
