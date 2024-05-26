
import java.util.*;

public class palindrome {
    public static void main(String[] args) {

        // Find Palindrome or not.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here: ");
        int rem;
        int rev = 0;
        int num = sc.nextInt();
        int a = num;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;

        }
        if (rev == a) {
            System.out.println("Yes, " + a + " it is a palindrome.");

        } else {
            System.out.println("No, " + a + " it is not a palindrome.");
        }

    }

}
