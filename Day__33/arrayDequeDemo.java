import java.util.*;

public class arrayDequeDemo {

    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(12);
        dq.offerLast(13);
        dq.offerLast(14);
        dq.offerLast(15);

        dq.pollFirst();

        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);

        System.out.println(dq);

    }

}
