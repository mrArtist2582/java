
import java.util.Arrays;
import java.util.List;

public class filtering_and_sum {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Sum of all numbers: " + sum);
    }
}
