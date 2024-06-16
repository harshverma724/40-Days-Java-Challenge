import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.util.*;

public class PropertyDemo {
    public static void main(String[] args) throws Exception {

        Properties p = new Properties();
        p.setProperty("Harsh", "001");
        p.setProperty("Chandu", "002");
        p.setProperty("Ankit", "005");
        p.setProperty("Ishaan", "003");
        p.setProperty("Steve", "004");
        p.setProperty("gg", "006");

        p.store(new FileOutputStream("C:\\Users\\harsh\\OneDrive\\Desktop\\java\\FileStreamTwo\\mydata.txt.txt"),
                "New Program");
        p.load(new FileInputStream("C:\\Users\\harsh\\OneDrive\\Desktop\\java\\FileStreamTwo\\mydata.txt.txt"));

        System.out.println(p);

    }

}