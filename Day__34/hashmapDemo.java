import java.util.Map;
import java.util.*;

public class hashmapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> tm = new HashMap<>(Map.of(1, "A", 2, "B"));

        tm.put(3, "C");
        tm.put(4, "D");
        tm.put(5, "E");

        System.out.println(tm);

    }

}
