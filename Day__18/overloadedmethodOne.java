public class overloadedmethodOne {

    static int calculateArea(int x, int y) {
        return x * y;
    }

    static int calculateArea(int x) {
        float a = 3.14f;
        int b = (int) a;
        return (b * x * x);
    }

    static int calculateArea(int x, int y, int height) {

        return (1 / 2 * (x + x) * height);
    }

    public static void main(String[] args) {

        System.out.println("Rectangle area " + calculateArea(2, 3));
        System.out.println("Circle area " + calculateArea(2));
        System.out.println("Trepizium area " + calculateArea(2, 3, 4));

    }

}
