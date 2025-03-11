
import java.util.Arrays;
import java.util.List;

public class method_ref {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kashish", "Kaushal", "Kirtan");
        System.out.println("\n ");
        System.out.println("Using Lambda function");
        // using lambda
        names.forEach(name -> System.out.println(name));
        System.out.println("\n ");
        System.out.println("Using Method Referance");
        // using Method referance
        names.forEach(System.out::println);
    }
}
