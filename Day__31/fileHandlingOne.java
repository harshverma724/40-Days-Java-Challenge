import java.io.File;

public class fileHandlingOne {
    public static void main(String[] args) throws Exception {
        File f = new File("C:\\Users\\harsh\\OneDrive\\Desktop\\java");

        System.out.println(f.isDirectory());

        File s[] = f.listFiles();
        for (File x : s) {
            System.out.println(x.getName());
            System.out.println(x.getPath());
            System.out.println(x.getParent());
        }

    }

}
