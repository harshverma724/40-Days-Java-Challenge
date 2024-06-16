import java.util.*;

public class linkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> thm = new LinkedHashMap<>(6, .75f, true);
        thm.put(1, "A");
        thm.put(2, "B");

        thm.put(3, "C");

        thm.put(4, "D");

        thm.put(5, "E");
        thm.put(7, "F");
        thm.put(6, "G");

        System.out.println(thm.get(3));
        System.out.println(thm.get(6));

        System.out.print(thm);

    }

}
