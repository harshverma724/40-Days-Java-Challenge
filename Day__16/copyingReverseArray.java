public class copyingReverseArray {
    public static void main(String[] args) {

        // Reverse Copuing an array.

        int A[] = { 1, 2, 3, 4, 5, 6, 7, 0, 0, 0 };
        int B[] = new int[A.length];
        int counter = A.length - 1;
        for (int i = 0; i <= (A.length - 1); i++) {
            B[i] = A[counter];
            counter--;
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
