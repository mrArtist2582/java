
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamToList {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kashish", "kirtan", "Kaushal", "Jahanvi");

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperNames);
    }
}
