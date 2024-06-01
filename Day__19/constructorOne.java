class Cylinder {
    private double radius;
    private double height;

    public Cylinder() {
        radius = 0;
        height = 0;
    }

    public Cylinder(double x) {
        radius = x;
        height = 1;
    }

    public Cylinder(double x, double y) {
        radius = x;
        height = y;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double x) {
        if (x > 0) {
            radius = x;
        } else {
            radius = 0;
        }

    }

    public void setHeight(double y) {
        if (y > 0) {
            height = y;
        } else {
            height = 0;
        }

    }

    public double area() {
        return (2 * Math.PI * getRadius() * getHeight()) + (2 * Math.PI * getRadius() * getHeight());
    }

}

public class constructorOne {
    public static void main(String[] args) {

        Cylinder c = new Cylinder();
        Cylinder c1 = new Cylinder(2);
        Cylinder c2 = new Cylinder(2, 3);

        System.out.println("Area: " + c.area());
        System.out.println("Area: " + c1.area());
        System.out.println("Area: " + c2.area());

    }

}
