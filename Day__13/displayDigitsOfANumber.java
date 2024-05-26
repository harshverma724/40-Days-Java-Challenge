
import java.util.*;

public class displayDigitsOfANumber {
    public static void main(String[] args) {

        // Display Digits of a number.
        Scanner sc = new Scanner(System.in);

        // Using For Loop.
        int num = 1;
        System.out.print("Enter the number here: ");
        int a = sc.nextInt();
        int numb = a;
        int number = a;
        String len = String.valueOf(a);
        int length = len.length();

        for (int i = length; i >= 1; i--) {
            num = a % 10;
            a = a / 10;
            System.out.print(num);

        }
        System.out.println();

        // Using while Loop.
        System.out.println();
        System.out.println("Using while loop.");
        int r = 1;
        while (numb > 0) {
            r = numb % 10;
            numb = numb / 10;
            System.out.print(r);
        }

        System.out.println();

        // Using d0-while Loop.
        System.out.println();
        System.out.println("Using do-while loop.");
        int rem = 1;
        do {
            rem = number % 10;
            number = number / 10;
            System.out.print(rem);
        } while (number > 0);

    }

}
