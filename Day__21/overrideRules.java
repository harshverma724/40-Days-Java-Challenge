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

public class overrideRules {
    public static void main(String[] args) {

        Super s = new Super();
        s.display();
        Sub s1 = new Sub();
        s1.display();

    }

}
