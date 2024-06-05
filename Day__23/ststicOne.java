class NewClass {
    static int x = 10;
    int y = 20;

    public void display() {
        System.out.println(x + " " + y);
    }

    static void show() {
        System.out.println(x);

    }
}

public class ststicOne {

    public static void main(String[] args) {
        NewClass n = new NewClass();
        n.display();
        n.x = 33;
        n.y = 43;

        NewClass n1 = new NewClass();
        n1.display();

    }

}
