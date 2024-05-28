
import java.util.*;

public class sumOfArrayElements {
    public static void main(String[] args) {

        // Find the sum of elements of an array.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array here: ");
        int a = sc.nextInt();
        int sum = 0;
        int A[] = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Enter element " + (i + 1) + " here: ");
            int b = sc.nextInt();
            A[i] = b;
            sum = sum + b;
        }

        System.out.println("Sum of elements is: " + sum);

    }

}
