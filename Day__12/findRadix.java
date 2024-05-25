import java.util.Scanner;

public class findRadix {
    public static void main(String[] args) {
        // Find Radix.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here: ");
        String num = sc.nextLine();
        if (num.matches("[01]+")) {
            System.out.println("Radix:2 Binary.");

        } else if (num.matches("[0-7]+")) {
            System.out.println("Radix:8 Octal.");

        } else if (num.matches("[0-9]+")) {
            System.out.println("Radix:10 Decimal.");

        } else if (num.matches("[0-9a-zA-Z]+")) {
            System.out.println("Radix:16 Hexa.");
        } else {
            System.out.println("Invalid Number.");
        }

    }
}