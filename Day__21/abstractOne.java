abstract class Super {
    public Super() {
        System.out.println("Super Constructor.");
    }

    public void meth1() {
        System.out.println("Super Method 1.");
    }

    abstract void meth2();
}

class Sub extends Super {
    public void meth2() {
        System.out.println("Meth2 of Sub.");
    }
}

public class abstractOne {
    public static void main(String[] args) {

        Sub s = new Sub();
        s.meth2();

    }

}
