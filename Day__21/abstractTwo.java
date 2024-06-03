abstract class Shape {
    abstract public double area();

    abstract public double perimeter();

}

class Circle extends Shape {
    public double radius;

    public void setRadius(double x) {
        radius = x;
    }

    public double area() {

        return Math.PI * radius * radius;
    }

    public double perimeter() {

        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    public double length;
    public double breadth;

    public void setLength(double x) {
        length = x;
    }

    public void setbreadth(double x) {
        breadth = x;
    }

    public double area() {

        return length * breadth;
    }

    public double perimeter() {

        return 2 * (length + breadth);
    }
}

public class abstractTwo {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.setRadius(4);
        System.out.println("Area of Circle: " + c.area());
        System.out.println("Perimeter of Circle: " + c.perimeter());

        Rectangle r = new Rectangle();
        r.setLength(3);
        r.setbreadth(4);
        System.out.println("Area of Rectangle: " + r.area());
        System.out.println("Perimeter of Rectangle: " + r.perimeter());

    }

}
