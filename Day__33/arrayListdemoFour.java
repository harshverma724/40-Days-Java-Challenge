import java.util.*;

public class arrayListdemoFour {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>(List.of(2, 3, 4, 5));
        a.add(21);
        a.add(37);
        a.add(16);
        a.add(53);

        a.addAll(a1);

        a.add(19);

        a.forEach(n -> System.out.print(n));

        System.out.println(a);

    }

}
