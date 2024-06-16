import java.lang.reflect.Array;
import java.util.Arrays;

public class comparatorDemo {

    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 1, 2, 3, 4, 5 };
        int c[] = { 1, 2, 3, 4, 5, 3 };
        int d[] = { 1, 2, 3, 4 };

        System.out.println(Arrays.compare(a, b));
        System.out.println(Arrays.compare(a, c));
        System.out.println(Arrays.compare(a, d));

        int p[] = Arrays.copyOf(a, 4);

        Arrays.sort(c);
        for (int x : p) {

            System.out.println(x);
        }

    }

}
