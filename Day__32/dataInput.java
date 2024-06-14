import java.io.*;

class Student {
    int rollno;
    String name;
    String dept;

}

public class dataInput {
    public static void main(String[] args) throws Exception {
        FileInputStream fos = new FileInputStream(
                "C:\\Users\\harsh\\OneDrive\\Desktop\\java\\FileStreamOne\\Student1.txt");
        DataInputStream dis = new DataInputStream(fos);

        Student s = new Student();
        s.rollno = dis.readInt();
        s.name = dis.readUTF();
        s.dept = dis.readUTF();

        System.out.println("Roll No: " + s.rollno);
        System.out.println("Name: " + s.name);
        System.out.println("Dept: " + s.dept);

        dis.close();
        fos.close();

    }

}
