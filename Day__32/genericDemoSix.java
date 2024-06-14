public class genericDemoSix {

    public static <T> void show(T[] Array) {
        for (T x : Array) {
            System.out.println(x);
        }
    }

    /*
     * public static <T extends Number> void show(T[] Array) {
     * for (T x : Array) {
     * System.out.println(x);
     * }
     * }
     */
    public static void main(String[] args) {

        show(new String[] { "Hi ", "Harsh ", "Nice ", "To ", "Meet ", "You." });

    }

}
