interface MyLambdaOne {
    public void show(String s);
}

public class lambdaFunOne {
    public static void main(String[] args) {

        MyLambdaOne m = (s) -> {
            System.out.println("Hello World and " + s);
        };
        MyLambdaOne m1 = (s) -> {
            System.out.println("Hello World and " + s);
        };
        m.show("Harsh");
        m1.show("Ashu");

    }

}
