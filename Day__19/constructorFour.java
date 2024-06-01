
class Student {
    private String rollno;
    private String name;
    private String dept;
    private String subjects[];

    public String a() {
        for (String x : subjects) {
            return (String) x;

        }
        return "c";
    }

    public String getRollNo() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getSubjects() {
        return a();
    }

    public void setDept(String x) {
        dept = x;
    }

    public void setSubjects(String... x) {
        subjects = x;
    }

    public Student(String x, String y) {
        rollno = x;
        name = y;
    }

    public Student(String a, String b, String c, String d) {
        rollno = a;
        name = b;
        setDept(c);
        setSubjects(d);
    }

    public String toString() {
        return "\nRoll No: " + getRollNo() + "\nSubject Name: " + getName() + "\nDepartment: "
                + getDept()
                + "\nSubjects: " + getSubjects();
    }

}

public class constructorFour {
    public static void main(String[] args) {

        Student subs[] = new Student[3];
        subs[0] = new Student("A101", "Harsh", "CSE", "harsh verma");
        subs[1] = new Student("A102", "Chandu", "Electronics", "");
        subs[2] = new Student("A103", "Ishaan", "Civil", "");

        for (Student s : subs) {
            System.out.println(s);
        }

    }

}
