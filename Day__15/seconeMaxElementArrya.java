public class seconeMaxElementArrya {
    public static void main(String[] args) {
        int A[] = { 123, 34, 234, 23, 92, 230, 59 };
        int max1 = A[0];
        int max2 = A[0];
        for (int i = 1; i <= (A.length - 1); i++) {
            if (A[i] > max1) {
                max1 = A[i];
            } else if (A[i] > max2) {
                max2 = A[i];
            }

        }
        System.out.println("Max Element: " + max1);
        System.out.println("2nd Max Element: " + max2);
    }
}
