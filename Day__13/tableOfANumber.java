import java.util.*;

public class tableOfANumber {
    public static void main(String[] args) {

        // Find table of a number.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number here: ");
        int a = sc.nextInt();
        System.out.println("USing For Loop.");
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " X " + i + " = " + (i * a));
        }
        // Using while loop.
        System.out.println();
        System.out.println("USing while Loop.");
        int i = 1;
        while (i <= 10) {
            System.out.println(a + " X " + i + " = " + (i * a));
            i++;
        }

        // Using do while loop.
        System.out.println();
        System.out.println("USing do-while Loop.");
        int j = 1;
        do {
            System.out.println(a + " X " + j + " = " + (j * a));
            j++;
        } while (j <= 10);

    }

}
