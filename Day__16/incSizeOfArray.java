public class incSizeOfArray {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, };
        int B[] = new int[2 * A.length];
        for (int i = 0; i <= (A.length - 1); i++) {
            B[i] = A[i];
        }
        A = B;
        for (int x : A) {
            System.out.print(x + " , ");
        }

    }

}
