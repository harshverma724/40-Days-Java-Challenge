interface MyLambdaOne {

    public int add(int a, int b);
}

public class lambdaFunThree {
    public static void main(String[] args) {

        MyLambdaOne m = (a, b) -> {
            return (a + b);
        };
        // m.show("Harsh");
        m.add(12, 10);

    }

}
