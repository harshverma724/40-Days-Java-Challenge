class Test {
    public int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    public int max(int x, int y, int z) {
        if (x > y && x > z)
            return z;
        else if (y > z)
            return y;
        else
            return z;
    }
}

public class polymorphism {

    public static void main(String[] args) {
        // through method overloading.

        Test t = new Test();
        System.out.println(t.max(15, 4));
        System.out.println(t.max(3, 4, 5));

    }

}
