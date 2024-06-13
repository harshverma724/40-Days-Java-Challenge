import java.io.*;

class Student {
    int rollno;
    String name;
    String dept;

}

public class printStream {

    public static void main(String[] args) throws Exception {
        FileOutputStream fi = new FileOutputStream(
                "C:\\Users\\harsh\\OneDrive\\Desktop\\java\\FileStreamOne\\Student.txt");

        PrintStream ps = new PrintStream(fi);

        Student s = new Student();
        s.rollno = 001;
        s.name = "Harsh";
        s.dept = "CSE";

        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);

        ps.close();
        fi.close();

    }

}
