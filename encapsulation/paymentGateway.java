
import java.util.Scanner;

abstract class Payment {

    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    abstract void processPayment();
}

// Credit Card Payment 
class CreditCardPayment extends Payment {

    @SuppressWarnings("unused")
    private final String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        System.out.println(" Processing Credit Card payment of $" + amount);
    }
}

// PayPal Payment
class PayPalPayment extends Payment {

    private final String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    void processPayment() {
        System.out.println(" Processing PayPal payment of $" + amount + " for " + email);
    }
}

// UPI Payment
class UpiPayment extends Payment {

    private final String upiId;

    public UpiPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void processPayment() {
        System.out.println(" Processing UPI payment of $" + amount + " for UPI ID: " + upiId);
    }
}

public class paymentGateway {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("@@@ Welcome to the Payment Gateway @@@");
            System.out.print("Enter the amount: ");
            double amount = scanner.nextDouble();
            System.out.println("\nChoose Payment Method:");
            System.out.println("1. Credit Card");
            System.out.println("2. PayPal");
            System.out.println("3. UPI");
            System.out.print("Enter your choice (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            Payment payment;
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Credit Card Number: ");
                    String cardNumber = scanner.nextLine();
                    payment = new CreditCardPayment(amount, cardNumber);
                }

                case 2 -> {
                    System.out.print("Enter PayPal Email: ");
                    String email = scanner.nextLine();
                    payment = new PayPalPayment(amount, email);
                }

                case 3 -> {
                    System.out.print("Enter UPI ID: ");
                    String upiId = scanner.nextLine();
                    payment = new UpiPayment(amount, upiId);
                }

                default -> {
                    System.out.println("❌ Invalid choice. Please try again.");
                    scanner.close();
                    return;
                }
            }
            payment.processPayment();

            scanner.close();
        }
    }
}
