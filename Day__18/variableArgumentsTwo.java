public class variableArgumentsTwo {

    static void sum(int... A) {
        int add = 0;
        for (int i = 0; i < A.length; i++) {
            add = add + A[i];
        }
        System.out.println(add);

    }

    public static void main(String[] args) {
        sum(10, 2, 3);

    }

}
