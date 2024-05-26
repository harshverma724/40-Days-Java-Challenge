import java.util.*;

public class sumOfNNUmbers {
    public static void main(String[] args) {

        // Find sum of N numbers.

        // Using for loop.
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the number here: ");
        int a = sc.nextInt();
        System.out.println("Using For Loop.");
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;

        }
        System.out.println(sum);

        // Using while Loop.
        System.out.println();
        System.out.println("Using while loop.");
        int add = 0;
        int j = 1;
        while (j <= a) {
            add = add + j;
            j++;
        }
        System.out.println(add);

        // Using do-while Loop.
        System.out.println();
        System.out.println("Using do-while loop.");
        int plus = 0;
        int k = 1;

        do {
            plus = plus + k;
            k++;
        } while (k <= a);
        System.out.println(plus);

    }

}
