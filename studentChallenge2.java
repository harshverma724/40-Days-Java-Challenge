import java.util.*;

public class studentChallenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Find a number is binary or not.

        System.out.print("Enter the binary number: ");
        String binary = sc.nextLine();
        if (binary.matches("[01]+")) {
            System.out.println("Yes it is a binary number.");
        } else {
            System.out.println("No, it is not a binary number.");
        }

        // Find a number is hexadecimal or not.

        System.out.print("Enter the HexaDecimal number: ");
        String hexa = sc.nextLine();
        if (hexa.matches("[0-9a-z]*")) {
            System.out.println("Yes it is a hexadecimal number.");
        } else {
            System.out.println("No, it is not a hexadecimal number.");
        }

        // Find is the date in Date format(dd/mm/yyyy)

        System.out.print("Enter the date in format(dd/mm/yyyy): ");
        String d = sc.nextLine();
        if (d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}")) {
            System.out.println("Yes this is in the format: " + d);
        } else {
            System.out.println("No, this is not in the format: " + d);
        }

    }

}
