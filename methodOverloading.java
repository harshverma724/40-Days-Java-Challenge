public class methodOverloading {

    static int sum(int x, int y) {
        return x > y ? x : y;
    }

    static float sum(float x, float y) {
        return x > y ? x : y;
    }

    static int sum(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }

    }

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        float c = 3.4f;
        float d = 4f;

        System.out.println(sum(2, 4));
        System.out.println(sum(3.4f, 4f));
        System.out.println(sum(3, 4, 5));

    }

}
