class Car {
    public void start() {
        System.out.println("Car Started.");
    }

    public void accelerate() {
        System.out.println("Car Accelerated.");
    }

    public void changeGear() {
        System.out.println("Manual Gear Changed.");
    }
}

class SmartCar extends Car {

    public void changeGear() {
        System.out.println("Automatic Gear Changed.");
    }

    public void sunRoof() {
        System.out.println("Smart car Sunroof Opened.");
    }
}

public class methodOverridingTwo {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();
        c.accelerate();
        c.changeGear();

        SmartCar c1 = new SmartCar();
        c1.start();
        c1.accelerate();
        c1.changeGear();
        c1.sunRoof();

    }

}
