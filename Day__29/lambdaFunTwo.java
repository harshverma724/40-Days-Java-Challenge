interface MyLambdaOneTwo {
    public void show();
}

class Demo {
    public void method1() {
        MyLambdaOneTwo m = () -> {
            System.out.println("Hello");
        };
        m.show();
    }
}

public class lambdaFunTwo {
    public static void main(String[] args) {

        Demo d = new Demo();
        d.method1();

    }

}
