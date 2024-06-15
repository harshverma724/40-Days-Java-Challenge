import java.util.*;

public class priorityDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(12);
        pq.add(21);
        pq.add(37);
        pq.add(16);
        pq.add(53);

        System.out.println(pq.peek());
        System.out.println("Before Deletion.");
        pq.forEach(n -> System.out.print(n + " "));

        pq.poll();
        System.out.println("\n");
        System.out.println("After Deletion.");
        pq.forEach(n -> System.out.print(n + " "));

    }

}
