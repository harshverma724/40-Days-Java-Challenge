class Rectangle {
    double length;
    double breadth;
    int x = 170;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void display() {
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
    }

}

class Cuboid extends Rectangle {
    double height;
    int x = 20;

    Cuboid(double length, double breadth, double h) {
        super(length, breadth);
        height = h;

    }

    void display() {

        System.out.println(super.x);
        System.out.println(x);

    }

}

public class thisVsSuper {
    public static void main(String[] args) {

        Cuboid c = new Cuboid(10, 20, 30);
        c.display();
        Rectangle r = new Rectangle(22, 33);
        r.display();

    }

}
