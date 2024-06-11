interface MyLambdaFour {

    public void show(String s);

}

public class lambdaFunFour {
    public static void main(String[] args) {
        MyLambdaFour m = System.out::println;
        m.show("harsh Verma");

    }

}
