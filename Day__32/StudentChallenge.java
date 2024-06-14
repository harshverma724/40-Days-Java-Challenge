
import java.io.*;

public class StudentChallenge {
    public static void main(String[] args) throws Exception {

        float s[] = { 1.3f, 3.2f, 2.5f, 6.4f, 9.0f, 0.8f };

        FileOutputStream fos = new FileOutputStream(
                "C:\\Users\\harsh\\OneDrive\\Desktop\\java\\FileStreamTwo\\Data.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(s.length);
        for (float x : s) {
            dos.writeFloat(x);
        }

        fos.close();
        dos.close();

        FileInputStream fis = new FileInputStream("C:\\Users\\harsh\\OneDrive\\Desktop\\java\\FileStreamTwo\\Data.txt");
        DataInputStream dis = new DataInputStream(fis);

        int length = dis.readInt();
        float data;
        for (int i = 0; i < length - 1; i++) {
            data = dis.readFloat();
            System.out.println(data);
        }

        fis.close();
        dis.close();
    }

}
