import java.util.*;

public class oddEven {
    public static void main(String[] args) {
        // Find is number even or odd.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here: ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }

    }

}
