import java.lang.*;
import java.util.*;

class Arithematic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to calculate area using base and height or with the three sides ?");
        System.out.println("Press 1 for 1st option and 2 for another one.");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.println("Enter the base value here: ");
            float base = sc.nextFloat();
            System.out.println("Enter the height here: ");
            float height = sc.nextFloat();

            float area = (base * height) / 2f;
            System.out.println("The Area of the triangle is: " + area);

        } else if (choice == 2) {
            float a, b, c, s, area;
            System.out.println("Enter the value of 3 sides here: ");
            System.out.println("Side 1: ");
            a = sc.nextFloat();
            System.out.println("Side 2: ");
            b = sc.nextFloat();
            System.out.println("Side 3: ");
            c = sc.nextFloat();

            s = (a + b + c) / 2f;
            area = (float) Math.sqrt(s * ((s - a) * (s - b) * (s - c)));
            System.out.println("The Area of the triangle is: " + area);
        } else {
            System.out.println("Invalid Choice.");
        }

    }
}