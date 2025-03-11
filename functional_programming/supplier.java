import java.time.LocalDate;
import java.util.function.Supplier;

public class supplier {
    public static void main(String[] args) {
        Supplier<LocalDate> today = () -> LocalDate.now();

        System.out.println("Today's date: " + today.get());
    }
}
