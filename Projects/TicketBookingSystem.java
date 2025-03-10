import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TicketBookingSystem {
    public static void main(String[] args) {
        Queue<String> bookingQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. View Next Booking");
            System.out.println("4. View All Bookings");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {

                    System.out.print("Enter Passenger Name: ");
                    String name = scanner.nextLine();
                    bookingQueue.add(name);
                    System.out.println(name + "'s ticket booked successfully!");
                }

                case 2 -> {

                    if (!bookingQueue.isEmpty()) {
                        String removedPassenger = bookingQueue.poll();
                        System.out.println(removedPassenger + "'s booking canceled!");
                    } else {
                        System.out.println("No bookings to cancel.");
                    }
                }

                case 3 -> {

                    if (!bookingQueue.isEmpty()) {
                        System.out.println("Next Passenger: " + bookingQueue.peek());
                    } else {
                        System.out.println("No bookings available.");
                    }
                }

                case 4 ->
                    System.out.println("Current Bookings: " + bookingQueue);

                case 5 -> {

                    System.out.println("Exiting Ticket Booking System. Thank you!");
                    scanner.close();
                    System.exit(0);
                }

                default -> System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}
