class Subject {
    private String subID;
    private String name;
    private double maxMarks;
    private double marksObtained;

    public String getSubId() {
        return subID;
    }

    public String getName() {
        return name;
    }

    public double getMaxMarks() {
        return maxMarks;
    }

    public double getMarksObtained() {
        return marksObtained;
    }

    public void setMaxMarks(double x) {
        maxMarks = x;
    }

    public void setMarksObtained(double x) {
        marksObtained = x;
    }

    public Subject(String x, String y) {
        subID = x;
        name = y;
    }

    public Subject(String a, String b, double c, double d) {
        subID = a;
        name = b;
        setMaxMarks(c);
        setMarksObtained(d);
    }

    public String toString() {
        return "\nSubject ID: " + getSubId() + "\nSubject Name: " + getName() + "\nMarks Obtained: "
                + getMarksObtained()
                + "\nMax Marks: " + getMaxMarks();
    }

}

public class constructorThree {
    public static void main(String[] args) {

        Subject subs[] = new Subject[3];
        subs[0] = new Subject("A101", "Java", 100, 95);
        subs[1] = new Subject("A102", "DSA", 100, 80);
        subs[2] = new Subject("A103", "Python", 100, 90);

        for (Subject s : subs) {
            System.out.println(s);
        }

    }

}
