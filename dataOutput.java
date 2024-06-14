import java.io.*;

class Student {
    int rollno;
    String name;
    String dept;

}

public class dataOutput {

    public static void main(String[] args) throws Exception {
        FileOutputStream fi = new FileOutputStream(
                "C:\\Users\\harsh\\OneDrive\\Desktop\\java\\FileStreamOne\\Student1.txt");

        DataOutputStream dos = new DataOutputStream(fi);

        Student s = new Student();
        s.rollno = 001;
        s.name = "Harsh";
        s.dept = "CSE";

        dos.writeInt(s.rollno);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);

        dos.close();
        fi.close();

    }

}
