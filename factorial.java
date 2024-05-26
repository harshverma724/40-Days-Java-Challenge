
import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Find Factorial of a number.

        System.out.print("Enter the number here: ");
        int a = sc.nextInt();

        // Using For loop.
        System.out.println("Using For Loop.");
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

        // Using while Loop.
        System.out.println();
        System.out.println("USing while loop.");
        int i = 1;
        int facto = 1;
        while (i <= a) {
            facto = facto * i;
            i++;
        }
        System.out.println(facto);

        // Using d0-while Loop.
        System.out.println();
        System.out.println("USing do-while loop.");
        int j = 1;
        int factorial = 1;
        do {
            factorial = factorial * j;
            j++;
        } while (j <= a);
        System.out.println(factorial);

    }

}
