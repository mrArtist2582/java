
import java.util.function.Predicate;

public class pridicate {

    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(56));
        System.out.println(isEven.test(23));

    }
}
