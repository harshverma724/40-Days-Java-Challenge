
import java.util.*;

public class insertElementInArray {
    public static void main(String[] args) {

        // Insert an element in an array.

        Scanner sc = new Scanner(System.in);
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 0, 0, 0 };
        System.out.print("Enter the element here: ");
        int element = sc.nextInt();
        System.out.print("Enter the index here: ");
        int index = sc.nextInt();

        for (int i = (A.length - 1); i > (index - 1); i--) {
            A[i] = A[i - 1];
        }
        A[index - 1] = element;

        for (int x : A) {
            System.out.print(x + " , ");
        }

    }

}
