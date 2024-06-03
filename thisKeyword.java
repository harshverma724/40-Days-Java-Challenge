class Rectangle {
    public double length;
    public double breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void display() {
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
    }

}

public class thisKeyword {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(2, 4);
        r1.display();

    }

}
