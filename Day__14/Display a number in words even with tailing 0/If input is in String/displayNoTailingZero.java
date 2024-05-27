import java.util.*;

public class displayNoTailingZero {
    public static void main(String[] args) {
        // Display a number in words tailing zero.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here: ");
        String num = sc.nextLine();
        for (int i = 1; i <= num.length(); i++) {
            // System.out.println(num.charAt(i - 1));
            char a = num.charAt(i - 1);
            switch (a) {
                case '1':
                    System.out.print("One ");
                    break;

                case '2':
                    System.out.print("Two ");
                    break;

                case '3':
                    System.out.print("Three ");
                    break;

                case '4':
                    System.out.print("Four ");
                    break;

                case '5':
                    System.out.print("Five ");
                    break;

                case '6':
                    System.out.print("Six ");
                    break;

                case '7':
                    System.out.print("Seven ");
                    break;

                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
                case '0':
                    System.out.print("Zero ");
                    break;
            }
            //

        }

    }

}
