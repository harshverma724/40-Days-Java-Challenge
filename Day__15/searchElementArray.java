
import java.util.*;

public class searchElementArray {
    public static void main(String[] args) {

        // Search an element and show its index.

        Scanner sc = new Scanner(System.in);
        int A[] = { 12, 32, 11, 41, 25, 64, 22, 16, 13 };
        System.out.print("Enter the element you want to search: ");
        int num = sc.nextInt();
        for (int i = 0; i <= (A.length - 1); i++) {

            if (A[i] == num) {
                System.out.println("Element is found at index " + i);
                System.exit(0);
            }

        }
        System.out.println("Element not found.");

    }

}
