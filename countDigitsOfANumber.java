import java.util.*;

public class countDigitsOfANumber {
    public static void main(String[] args) {

        // Count the not of digits of a number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here: ");
        int a = sc.nextInt();

        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;

        }
        System.out.println(count);

    }

}
