import java.util.*;

public class exceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter value of x here: ");
            int a = sc.nextInt();
            System.out.print("Enter value of y here: ");
            int b = sc.nextInt();
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("Try Again.");
        }
    }
}
