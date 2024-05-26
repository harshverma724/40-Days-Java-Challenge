import java.util.*;

public class reverseANumber {
    public static void main(String[] args) {

        // Find reverse of a number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here: ");
        int num = sc.nextInt();
        int a = num;
        int rem;
        int reverse = 0;
        while (num > 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        System.out.println(reverse + " is reverse of " + a);
    }

}
