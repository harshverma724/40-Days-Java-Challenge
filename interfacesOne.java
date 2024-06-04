
interface Test {

    void method1();

    void method2();

}

class New implements Test {
    public void method1() {
        System.out.println("method 1.");

    }

    public void method2() {
        System.out.println("method 2.");
    }

    public void method3() {
        System.out.println("method 3.");
    }
}

public class interfacesOne {
    public static void main(String[] args) {

        Test t = new New();
        t.method1();
        t.method2();

        New n = new New();
        n.method3();

    }

}
