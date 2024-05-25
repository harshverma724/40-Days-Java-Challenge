import java.util.*;

public class conditional {
    public static void main(String[] args) {

        // Find if a number is positive or negative.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. here: ");
        int a = sc.nextInt();
        if (a >= 0) {
            System.out.println("The number is positive.");

        } else {
            System.out.println("The number is negative.");
        }

    }

}
