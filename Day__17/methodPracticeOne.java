
import java.util.*;

public class methodPracticeOne {

    static void update(int A[], int x, int y) {
        A[y] = x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.print("Enter the element here: ");
        int a = sc.nextInt();

        System.out.print("Enter the index here: ");
        int b = sc.nextInt();

        update(A, a, b - 1);

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }

}
