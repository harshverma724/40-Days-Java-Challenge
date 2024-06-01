class Rectangle {

    private double length;
    private double breadth;

    public Rectangle() {
        length = 1;
        breadth = 1;
    }

    public Rectangle(double x, double y) {
        setlength(x);
        ;
        setbreadth(y);
        ;
    }

    public Rectangle(double x) {
        length = breadth = x;

    }

    public double getlength() {
        return length;
    }

    public double getbreadth() {
        return breadth;
    }

    public void setlength(double x) {
        if (x > 0) {
            length = x;
        } else {
            length = 0;
        }

    }

    public void setbreadth(double y) {
        if (y > 0) {
            breadth = y;
        } else {
            breadth = 0;
        }
    }

    public double area() {
        return getlength() * getbreadth();

    }

    public double perimeter() {
        return 2 * (length + breadth);

    }

    public boolean isSquare() {
        if (length == breadth) {
            return true;
        } else
            return false;

    }
}

public class constructor {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(-2, 3);
        System.out.println("Area: " + r1.area());

    }

}
