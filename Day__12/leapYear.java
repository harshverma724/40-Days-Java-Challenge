import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        // Find Leap year or not.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year here: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + "is not a leap year.");
        }

    }

}
