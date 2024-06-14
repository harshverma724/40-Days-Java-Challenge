import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int rollno;
    String name;
    String dept;

    public Student(int a, String b, String c) {
        rollno = a;
        name = b;
        dept = c;

    }

    public void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Dept: " + dept);

    }
}

public class serialization {

    public static void main(String[] args) throws Exception {
        FileOutputStream fi = new FileOutputStream(
                "C:\\Users\\harsh\\OneDrive\\Desktop\\java\\FileStreamTwo\\Student2.txt");

        ObjectOutputStream dos = new ObjectOutputStream(fi);

        Student s = new Student(002, "Chandu", "CSE");

        dos.writeObject(s);

        dos.close();
        fi.close();

    }

}
