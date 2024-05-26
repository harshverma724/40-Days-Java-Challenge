import java.util.*;

public class armstrongNumber {
    public static void main(String[] args) {
        // Find a number is armstrong or not.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here: ");
        int num = sc.nextInt();
        int a = num;
        int rem = 0;
        int number = 1;
        while (num > 0) {
            number = num % 10;
            num = num / 10;
            rem = rem + (number * number * number);
        }
        if (a == rem) {
            System.out.println(a + " is an armstrong number.");
        } else {
            System.out.println(a + " is not an armstrong number.");
        }

    }
}
