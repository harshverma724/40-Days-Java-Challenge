class Super {
    public void meth1() {
        System.out.println("Super Method 1.");

    }

    public void meth2() {
        System.out.println("Super Method 2.");
    }

}

class Sub extends Super {
    public void meth2() {
        System.out.println("Sub Method 2.");

    }

    public void meth3() {
        System.out.println("Sub Method 3.");
    }
}

public class dynamicMethodDispatch {
    public static void main(String[] args) {

        Super s = new Super();
        s.meth1();
        s.meth2();

    }

}
