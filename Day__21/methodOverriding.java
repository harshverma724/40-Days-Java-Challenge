class Super {
    public void display() {
        System.out.println("Hello.");
    }
}

class Sub extends Super {
    public void display() {
        System.out.println("Hello World.");
    }
}

public class methodOverriding {
    public static void main(String[] args) {

        Super sup = new Super();
        sup.display();

        Sub sub = new Sub();
        sub.display();

        Super sub1 = new Sub();
        sub1.display();

    }

}
