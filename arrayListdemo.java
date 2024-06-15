import java.util.*;

public class arrayListdemo {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>(20);
        ArrayList<Integer> a1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        a.add(12);
        a.add(0, 42);

        a.addAll(1, a1);
        a.add(3, 22);
        a.add(5, 22);
        a.add(8, 22);

        System.out.println(a.indexOf(22));
        System.out.println(a.lastIndexOf(22));

        System.out.println(a.contains(4));
        System.out.println(a.contains(21));

        System.out.println(a.get(6));
        System.out.println(a.indexOf(3));

        System.out.println(a);

    }

}
