class MyNew {
    final int MIN = 1;
    final static int MAX;
    final int NORMAL;

    static {
        MAX = 100;
        System.out.println(MAX);

    }

    MyNew() {
        NORMAL = 50;
    }

    public final void show() {
        System.out.println("hello");
    }
}

public class finalOne {
    public static void main(String[] args) {
        MyNew n = new MyNew();
        n.show();

    }

}
