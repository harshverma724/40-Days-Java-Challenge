import java.util.*;

public class BitSetDemo {
    public static void main(String[] args) {

        BitSet b = new BitSet();
        b.set(0);
        b.set(2);
        b.set(4);
        b.set(6);
        b.set(8);

        BitSet b1 = new BitSet();
        // b1.set(0);
        b1.set(1);
        b1.set(2);
        b1.set(3);
        b1.set(4);
        b1.set(5);
        b1.set(6);
        b1.set(7);
        // b1.set(8);

        b.and(b1);
        b.or(b1);
        b.xor(b1);

        System.out.println(b);

    }

}
