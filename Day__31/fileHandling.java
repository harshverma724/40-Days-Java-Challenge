import java.io.File;

public class fileHandling {
    public static void main(String[] args) throws Exception {
        File f = new File("C:\\Users\\harsh\\OneDrive\\Desktop\\java");

        System.out.println(f.isDirectory());

        String s[] = f.list();
        for (String x : s) {
            System.out.println(x);
        }

    }

}
