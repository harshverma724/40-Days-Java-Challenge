public class copyArray {
    public static void main(String[] args) {

        // Copying an Array.

        int A[] = { 1, 2, 3, 4, 5, 6, 7, 0, 0, 0 };
        int B[] = new int[A.length];

        for (int i = 0; i <= (A.length - 1); i++) {
            B[i] = A[i];

        }
        System.out.print("Array A: ");
        for (int x : A) {

            System.out.print(x + " , ");
        }
        System.out.println();
        System.out.print("Array B: ");
        for (int x : B) {

            System.out.print(x + " , ");
        }

    }

}
