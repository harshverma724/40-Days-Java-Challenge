import java.io.*;

class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    int rollno;
    String name;
    String dept;

    public Student() {

    }

    public Student(int a, String b, String c) {
        rollno = a;
        name = b;
        dept = c;

    }

    public String toString() {
        return "Student Details: \n" + "Roll No: " + rollno + "\n" + "Name: " + name + "\n" + "Department: " + dept;

    }
}

public class serializationOne {

    public static void main(String[] args) throws Exception {
        FileInputStream fi = new FileInputStream(
                "C:\\Users\\harsh\\OneDrive\\Desktop\\java\\FileStreamTwo\\Student2.txt");

        ObjectInputStream dos = new ObjectInputStream(fi);

        Student s = (Student) dos.readObject();
        System.out.println(s);

        dos.close();
        fi.close();

    }

}
