class Cylinder {
    public double radius;
    public double height;

    public double lidArea() {
        return Math.PI * radius * radius;

    }

    public double totalSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);

    }

    public double volume() {
        return Math.PI * radius * radius * height;

    }

    public double circumference() {
        return 2 * Math.PI * radius * height;

    }
}

public class cylinderClass {
    public static void main(String[] args) {

        Cylinder c = new Cylinder();

        c.radius = 7;
        c.height = 10;

        System.out.println("Lid Area: " + c.lidArea());
        System.out.println("TOtal Surface Area: " + c.totalSurfaceArea());
        System.out.println("Volume: " + c.volume());
        System.out.println("Circumference: " + c.circumference());

    }
}
