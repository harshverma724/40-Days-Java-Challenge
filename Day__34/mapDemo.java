import java.util.*;

public class mapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(1, "A", 2, "B"));

        tm.put(3, "C");
        tm.put(4, "D");
        tm.put(5, "E");

        System.out.println(tm.ceilingEntry(5).getValue());
        System.out.println(tm);

        System.out.println(tm.containsKey(2));
        System.out.println(tm.containsValue("F"));

    }

}
