public class nestedTryCatchOne {
    public static void main(String[] args) {

        int A[] = { 1, 2, 0, 3, 4, 5, 0, 0, };

        try {
            System.out.println("Division is: " + A[0] / A[2]);
            System.out.println(A[8]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by Zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Out of Bound.");
        }

        System.out.println("Program Executed.");

    }

}
