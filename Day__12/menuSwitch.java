import java.util.Scanner;

public class menuSwitch {
    public static void main(String[] args) {

        // Menu Driven Program.

        Scanner sc = new Scanner(System.in);
        System.out.println("Menu\nADD\nSub\nMul\nDiv");
        System.out.print("Enter no 1 here: ");
        int num1 = sc.nextInt();
        System.out.print("Enter no 2 here: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter option in words: ");
        String option = sc.nextLine();
        option = option.toUpperCase();

        switch (option) {

            case "ADD":
                System.out.println("Addition : " + (num1 + num2));
                break;

            case "SUB":
                System.out.println("Addition : " + (num1 - num2));
                break;

            case "MUL":
                System.out.println("Addition : " + (num1 * num2));
                break;

            case "DIV":
                System.out.println("Addition : " + (num1 / num2));
                break;

            default:
                System.out.println("Invalid Operation.");
                break;
        }

    }

}
