
import java.util.Arrays;
import java.util.List;

public class filtering {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kasihsh", "kirtan", "Annie", "David");

        names.stream()
                .filter(name -> name.startsWith("K"))
                .forEach(System.out::println);
    }
}
