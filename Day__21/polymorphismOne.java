class Super {
    public void display() {
        System.out.println("Super Display");
    }

}

class Sub extends Super {

    public void display() {
        System.out.println("Sub Display.");
    }

}

public class polymorphismOne {
    public static void main(String[] args) {

        // Through Method Overriding

        Super s = new Super();
        s.display();

        Super s1 = new Sub();
        s1.display();

    }

}
