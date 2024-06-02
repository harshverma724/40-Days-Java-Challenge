class Rectangle {

    public int length;
    public int breadth;

    public Rectangle() {
        length = breadth = 1;

    }

    public Rectangle(int x, int y) {
        length = x;
        breadth = y;

    }

}

class Cuboid extends Rectangle {

    public int height;

    public Cuboid() {
        height = 1;

    }

    public Cuboid(int x) {
        height = x;

    }

    public Cuboid(int x, int y, int z) {
        super(x, y);
        height = z;

    }

    public int volume() {
        return length * breadth * height;
    }

}

public class parametrisedConstructorOne {

    public static void main(String[] args) {

        Cuboid c = new Cuboid();
        System.out.println("Non Para: " + c.volume());

        Cuboid c1 = new Cuboid(3);
        System.out.println("Non Para Parent: " + c1.volume());

        Cuboid c2 = new Cuboid(3, 6, 7);
        System.out.println("Para Parent: " + c2.volume());

    }

}
