class MyException extends Exception {
    public void harsh() {
        System.out.println("Erroe here please check code.");
    }
}

public class customException {

    static void fun1() {

        try {
            throw new MyException();

        } catch (MyException e) {
            System.out.println(e);
        }

    }

    static void fun2() {
        fun1();

    }

    static void fun3() {
        fun2();

    }

    public static void main(String[] args) {

        fun3();

    }

}
