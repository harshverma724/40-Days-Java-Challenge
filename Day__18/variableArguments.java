public class variableArguments {

    static void elements(String... A) {
        for (String x : A) {
            System.out.print(x + " , ");
        }
    }

    public static void main(String[] args) {
        elements("1, 2, 3, 4, 5, 6, 7", "harsh");

    }

}
