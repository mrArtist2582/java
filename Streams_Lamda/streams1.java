
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streams1 {

    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Kashish", "kirtan", "kaushal", "jahanvi");

       
        Stream<String> nameStream = names.stream();

 
        nameStream.forEach(System.out::println);
    }
}
