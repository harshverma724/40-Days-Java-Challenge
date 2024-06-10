class My<T> {
    @SafeVarargs
    private void show(T... args) {
        for (T x : args) {
            System.out.println(x);
        }
    }
}

public class annotationsThree {
    public static void main(String[] args) {

    }

}
