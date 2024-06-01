class Rectangle {
    private double length;
    private double breadth;

    public double getlength() {
        return length;
    }

    public double getbreadth() {
        return breadth;
    }

    public void setlength(double x) {
        length = x;
    }

    public void setbreadth(double y) {
        breadth = y;
    }

    public double area() {
        return length * breadth;

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

class dataHiding {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.setlength(2);
        r1.setbreadth(3);

        System.out.println("Length: " + r1.getlength());
        System.out.println("Breadth: " + r1.getbreadth());
        System.out.println("Area: " + r1.area());
        System.out.println("Area: " + r1.perimeter());
        System.out.println("Square: " + r1.isSquare());

    }

}
