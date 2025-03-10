import java.util.LinkedList;
import java.util.Queue;

public class simple {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Kashish");
        queue.add("Kirtan");
        queue.add("Kaushal");
        queue.add("Jahanvi");

        System.out.println("Queue: " + queue);
        System.out.println("Serving: " + queue.poll());
        System.out.println("Queue after serving: " + queue);
    }
}
