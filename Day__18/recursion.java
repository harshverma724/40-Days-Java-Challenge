public class recursion {

    static void fun(int x) {
        if (x > 0) {
            System.out.println(x);
            fun(x - 1);
        }
    }

    static void fun2(int y) {
        if (y > 0) {
            fun2(y - 1);
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        fun(3);
        System.out.println("");
        fun2(3);

    }

}
