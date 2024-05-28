public class rotatingAnArray {
    public static void main(String[] args) {
        int A[] = { 23, 13, 43, 54, 73, 52, 91 };
        int n1 = A[0];
        for (int i = 0; i < (A.length - 1); i++) {
            A[i] = A[i + 1];

        }
        A[A.length - 1] = n1;
        for (int x : A) {
            System.out.print(x + " , ");

        }

    }

}
