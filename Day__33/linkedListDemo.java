import java.util.*;

public class linkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> a = new LinkedList<>();
        LinkedList<Integer> a1 = new LinkedList<>(List.of(2, 3, 4, 5));
        a.add(21);
        a.add(37);
        a.add(16);
        a.add(53);

        a.addAll(a1);

        a.add(19);

        a.addFirst(7);
        a.addLast(222);

        a.forEach(n -> System.out.print(n + " "));

    }

}
