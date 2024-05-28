
public class maxElementArray {
    public static void main(String[] args) {
        int A[] = { 123, 34, 234, 23, 92, 230, 59 };
        int max = A[0];
        for (int i = 0; i <= (A.length - 1); i++) {
            if (A[i] > max) {
                max = A[i];
            }

        }
        System.out.println("Max Element of the array is: " + max);
    }

}
