import java.util.*;

public class variableArgumentsOne {

    static void max(int... A) {

        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args) {

        max(10, 290, 30, 40);

    }

}
