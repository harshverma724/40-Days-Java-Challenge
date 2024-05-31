class Student {
    public int rollno;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public float average() {
        return (float) total() / 3;
    }

    public String grade() {
        if (average() > 70) {
            return "Grade A";
        } else if (average() <= 69 && average() > 60) {
            return "Grade B.";
        } else if (average() <= 59 && average() > 50) {
            return "Grade C.";
        } else if (average() <= 49 && average() > 40) {
            return "Grade D.";
        } else
            return "Fail.";

    }

    public String details() {
        return "\n" + "Roll No: " + rollno + "\n" + "Name: " + name + "\n" + "Course" + course;
    }
}

public class studentClass {
    public static void main(String[] args) {

        Student s = new Student();
        s.rollno = 1;
        s.name = "Harsh";
        s.course = "B.Tech";
        s.m1 = 70;
        s.m2 = 80;
        s.m3 = 65;

        System.out.println("Student Details: " + s.details());
        System.out.println("Total Marks: " + s.total());
        System.out.println("Average :" + s.average());
        System.out.println("Grade: " + s.grade());

    }

}
