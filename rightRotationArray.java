public class rightRotationArray {

    // Right Rotation.
    public static void main(String[] args) {
        int A[] = { 23, 13, 43, 54, 73, 52, 91 };
        int n1 = A[A.length - 1];
        for (int i = (A.length - 1); i > 0; i--) {
            A[i] = A[i - 1];

        }
        A[0] = n1;
        for (int x : A) {
            System.out.print(x + " , ");

        }
    }

}
