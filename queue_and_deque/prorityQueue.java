import java.util.PriorityQueue;

public class prorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("Serving: " + pq.poll());
        System.out.println("Next: " + pq.poll());
        System.out.println("Next: " + pq.poll());
    }
}