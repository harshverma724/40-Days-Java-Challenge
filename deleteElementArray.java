import java.util.*;

public class deleteElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Delete an element from the array.

        int A[] = { 1, 2, 3, 4, 5, 6, 7, 0, 0, 0 };
        System.out.print("Enter the element index here: ");
        int index = sc.nextInt();
        for (int i = index - 1; i < (A.length - 1); i++) {
            A[i] = A[i + 1];
        }
        for (int x : A) {
            System.out.print(x + " , ");
        }
    }

}
