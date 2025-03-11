
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumer {

    public static void main(String[] args) {
        List<String> users = Arrays.asList("Kashish", "Jahanvi", "Kirtan");

        Consumer<String> sendNotification = user -> System.out.println("Sending notification to: " + user);

        users.forEach(sendNotification);
    }
}
