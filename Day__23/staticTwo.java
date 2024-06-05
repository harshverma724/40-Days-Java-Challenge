import java.util.*;

class Student {
    private String rollno;
    private static int count = 1;

    private String assignRollNo() {
        Date d = new Date();
        String rno = "Univ-" + "(2024) " + "-" + count;
        count++;

        return rno;

    }

    Student() {
        rollno = assignRollNo();

    }

    public String getRollNo() {
        return rollno;

    }

}

public class staticTwo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());

    }

}
