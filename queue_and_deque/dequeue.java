
import java.util.ArrayDeque;
import java.util.Deque;

public class dequeue {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.add("Kashish");
        dq.add("Kirtan");
        dq.add("Kaushal");

        System.out.println("Queue: " + dq);
        System.out.println("Serving: " + dq.pollFirst());
        System.out.println("Serving: " + dq.pollLast());
    }
}
