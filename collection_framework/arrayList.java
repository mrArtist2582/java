
import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();

        student.add("Kasihsh");
        student.add("Jahanvi");
        student.add("kaushal");

        System.out.println("Student 0 : " + student.get(0));

        student.remove(2);
        System.out.println("Students : " + student);
    }
}
