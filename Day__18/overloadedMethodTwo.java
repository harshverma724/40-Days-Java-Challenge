public class overloadedMethodTwo {

    int reverse(int x) {

        int rev = 0;
        while (x > 0) {

            rev = rev * 10 + x % 10;
            x = x / 10;

        }
        return rev;

    }

    void reverse(int A[]) {
        int B[] = new int[A.length];

        for (int i = A.length - 1, j = 0; i >= 0; i--, j++)
            B[j] = A[i];

        for (int x : B) {
            System.out.print(x + " , ");
        }

    }

    public static void main(String[] args) {
        overloadedMethodTwo fun = new overloadedMethodTwo();
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        fun.reverse(A);

        System.out.println(fun.reverse(237));

    }

}
