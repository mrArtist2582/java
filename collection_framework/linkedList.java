
import java.util.LinkedList;

public class linkedList {
    
    public static void main(String[] args) {
        LinkedList<String> student = new LinkedList<>();

        student.add("Kashish");
        student.add("jahanvi");
        student.add("Kirtan");

        student.addFirst("Kaushal");
        student.addLast("krunal");

        student.remove("Kirtan");

        System.out.println("Students : " +student);
    }
}
