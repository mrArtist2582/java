
import java.util.Arrays;
import java.util.List;

public class sorting {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kashish", "Kirtan", "Ami", "Jahanvi");

        names.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
