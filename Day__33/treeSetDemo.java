import java.util.*;

public class treeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(1, 2, 3, 4, 3, 10, 5, 6));
        ts.add(12);
        ts.add(21);

        System.out.println(ts.ceiling(7));
        System.out.println(ts);

    }

}
