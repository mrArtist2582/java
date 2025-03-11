import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class example {
    public static void main(String[] args) {
        
        Supplier<Integer> randomNumber = () -> new Random().nextInt(100);

       
        Predicate<Integer> isEven = num -> num % 2 == 0;

       
        Consumer<Integer> printNumber = num -> System.out.println("Even number: " + num);

        
        int number = randomNumber.get();
        System.out.println("Generated number: " + number);

        
        if (isEven.test(number)) {
            printNumber.accept(number);
        } else {
            System.out.println("Number is odd");
        }
    }
}
