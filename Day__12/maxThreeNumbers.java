import java.util.*;

public class maxThreeNumbers {
    public static void main(String[] args) {
        // Find max number between 3 numbers.

        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter number 1 here: ");
        a = sc.nextInt();
        System.out.print("Enter number 2 here: ");
        b = sc.nextInt();
        System.out.print("Enter number 3 here: ");
        c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("A is max.");
            }
        } else {
            if (b > c) {
                System.out.println("B is max.");
            } else {
                System.out.println("C is max.");
            }
        }

    }

}
