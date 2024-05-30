import java.util.*;

public class methodInitilization {

    static int sum(int x, int y) {
        return x + y;

    }

    static int max(int x, int y) {
        if (x > y) {
            return x;

        } else {
            return y;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a here: ");
        int a = sc.nextInt();
        System.out.print("Enter b here: ");
        int b = sc.nextInt();
        System.out.println("Sum of " + a + " and " + b + " is: " + sum(a, b));

        System.out.println(max(a, b) + " is greater.");

    }

}
