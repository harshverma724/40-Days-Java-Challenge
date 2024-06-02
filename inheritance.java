
class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    // Setter for height
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;

    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }

}

class Cylinder extends Circle {

    private double height;

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return area() * height;
    }
}

public class inheritance {
    public static void main(String[] args) {

        Cylinder c = new Cylinder();
        c.setRadius(6);
        c.setHeight(3);

        System.out.println("Area: " + c.area());

        System.out.println("Volume: " + c.volume());

    }

}
