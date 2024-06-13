import java.io.*;

public class randomAccess {
    public static void main(String[] args) throws Exception {
        RandomAccessFile r = new RandomAccessFile("C:/Users/harsh/OneDrive/Desktop/java/FileStreamOne/Random Demo.txt",
                "rw");
        System.out.println((char) r.read());
        System.out.println((char) r.read());
        System.out.println((char) r.read());
        // r.write('d');
        System.out.println((char) r.read());
        System.out.println((char) r.read());
        System.out.println((char) r.read());
        // r.seek(0);
        r.skipBytes(3);
        System.out.println((char) r.read());
        System.out.println(r.getFilePointer());

    }

}
