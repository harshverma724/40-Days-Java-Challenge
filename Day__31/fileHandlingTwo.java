import java.io.File;
import java.io.FileOutputStream;

public class fileHandlingTwo {
    public static void main(String[] args) throws Exception {

        File f = new File("C:\\Users\\harsh\\OneDrive\\Desktop\\java\\java.txt");
        f.setReadOnly();
        f.setWritable(true);
        System.out.println(f.lastModified());
        FileOutputStream fos = new FileOutputStream("C:\\Users\\harsh\\OneDrive\\Desktop\\java\\java.txt");

    }

}
