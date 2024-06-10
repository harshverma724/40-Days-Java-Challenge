class oldClass {
    public void display() {
        System.out.println("Hehe");
    }

    @Deprecated
    public void show() {
        System.out.println("Hola");

    }
}

public class annotationsTwo {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        oldClass o = new oldClass();
        o.show();

    }

}
