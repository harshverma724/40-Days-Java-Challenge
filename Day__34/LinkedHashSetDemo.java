import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>(12);
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("E");
        lhs.add("F");
        lhs.add("G");

        lhs.add("A");

        lhs.forEach(n -> System.out.println(n + " "));

    }

}
