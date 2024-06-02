class Parent1 {

    public Parent1() {
        System.out.println("Non Parametrised Parent Called.");

    }

    public Parent1(int x) {
        System.out.println("Parametrised Parent Called.");

    }

}

class Child1 extends Parent1 {

    public Child1() {

        System.out.println("Non Parametrised Child Called.");

    }

    public Child1(int x) {
        System.out.println("Parametrised Child Called.");

    }

    public Child1(int x, int y) {
        super(x);
        System.out.println("Parametrised Child Called.");

    }

}

public class parametrisedConstructor {
    public static void main(String[] args) {
        Child1 a = new Child1();
        System.out.println();
        Child1 b = new Child1(3);
        System.out.println();
        Child1 c = new Child1(3, 4);

    }

}
