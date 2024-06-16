import java.util.*;

public class hashTableDemo {

    public static void main(String[] args) {

        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "Harsh");
        ht.put(2, "ishaan");
        ht.put(3, "Chandu");
        ht.put(4, "Steve");

        ht.replace(2, "Ishaan");
        System.out.println(ht);
    }

}
