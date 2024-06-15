import java.util.*;

public class hashsetDemo {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(21);
        hs.add(37);
        hs.add(12);
        hs.add(53);

        hs.forEach(n -> System.out.println(n + " "));
    }

}
