import java.util.*;

public class grades {
    public static void main(String[] args) {

        // Find grades of a student.

        Scanner sc = new Scanner(System.in);
        float sub1, sub2, sub3;
        System.out.print("Enter Subject 1 marks here: ");
        sub1 = sc.nextFloat();
        System.out.print("Enter Subject 2 marks here: ");
        sub2 = sc.nextFloat();
        System.out.print("Enter Subject 3 marks here: ");
        sub3 = sc.nextFloat();
        float total = sub1 + sub2 + sub3;
        float avg = total / 3;
        System.out.println("avg: " + avg);
        float percentage = ((total / 300) * 100);

        if (avg >= 70) {
            System.out.println("A Grade. " + percentage + "%");
        } else if (avg < 70 && avg >= 60) {
            System.out.println("B Grade. " + percentage + "%");
        } else if (avg < 60 && avg >= 50) {
            System.out.println("C Grade. " + percentage + "%");
        } else if (avg < 50 && avg >= 40) {
            System.out.println("D Grade." + percentage + "%");
        } else {
            System.out.println("F Grade. " + percentage + "%");
        }

    }

}