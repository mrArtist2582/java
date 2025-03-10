import java.util.ArrayDeque;

public class arrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<>();

        ad.add("Kashish");
        ad.add("Kaushal");
        ad.add("Kirtan");

        ad.addFirst("jahanvi");

        System.out.println("Current Queue: " + ad);
        System.out.println("Now : " + ad.pollFirst());
        System.out.println("Last guest leaving: " + ad.pollLast());
        System.out.println("Final Queue: " + ad);
    }
}
