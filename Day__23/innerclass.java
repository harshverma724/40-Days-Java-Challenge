class Outer {
    int x = 10;

    class Inner {
        int y = 20;

        public void display() {
            System.out.println(x + " " + y);
        }
    }

    Inner i = new Inner();

    public void outerDisplay() {
        Inner i = new Inner();
        i.display();

    }
}

public class innerclass {
    public static void main(String[] args) {

        Outer o = new Outer();
        o.outerDisplay();

    }

}
