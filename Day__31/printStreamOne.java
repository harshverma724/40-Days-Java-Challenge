import java.io.*;

class Student {
    int rollno;
    String name;
    String dept;

}

public class printStreamOne {

    public static void main(String[] args) throws Exception {
        FileInputStream fi = new FileInputStream(
                "C:\\Users\\harsh\\OneDrive\\Desktop\\java\\FileStreamOne\\Student.txt");

        BufferedReader br = new BufferedReader(new InputStreamReader(fi));

        Student s = new Student();

        s.rollno = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();

        System.out.println("Rollno: " + s.rollno);
        System.out.println("Name: " + s.name);
        System.out.println("Dept: " + s.dept);

    }

}
