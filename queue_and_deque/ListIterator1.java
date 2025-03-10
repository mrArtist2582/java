import java.util.*;

public class ListIterator1 {
    public static void main(String[] args) {
        ArrayList<String> trainSeats = new ArrayList<>();
        trainSeats.add("Passenger 1");
        trainSeats.add("Passenger 2");
        trainSeats.add("Passenger 3");

        ListIterator<String> listIterator = trainSeats.listIterator();

        // Moving forward
        while (listIterator.hasNext()) {
            String passenger = listIterator.next();
            System.out.println("Checking: " + passenger);

            // Updating Passenger 2's name
            if (passenger.equals("Passenger 2")) {
                listIterator.set("Updated Passenger 2");
            }
        }

        // Moving backward
        System.out.println("\nRechecking in reverse order:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("\nFinal Seat List: " + trainSeats);
    }
}
