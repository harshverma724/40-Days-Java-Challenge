import java.util.*;

public class arrayListdemoTwo {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(20);
        ArrayList<Integer> a1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        a.add(12);
        a.add(0, 42);

        a.addAll(1, a1);
        a.add(3, 22);
        a.add(5, 22);

        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();

        for (var x : a) {
            System.out.print(x + " ");
        }

    }
}
