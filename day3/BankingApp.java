
import java.util.Scanner;

class BankAccount {

    private final String accountHolder;
    private double balance;
    private final String[] transactions = new String[5]; // Stores last 5 transactions
    private int transactionCount = 0;

    // Constructor to initialize account
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            addTransaction("Deposited: $" + amount);
            System.out.println("Deposit successful! New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        try {
            if (amount > balance) {
                throw new Exception("Insufficient balance!");
            } else if (amount <= 0) {
                throw new Exception("Invalid withdrawal amount!");
            }
            balance -= amount;
            addTransaction("Withdrawn: $" + amount);
            System.out.println("Withdrawal successful! New Balance: $" + balance);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Display account details
    public void displayDetails() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Current Balance: $" + balance);
        System.out.println("Recent Transactions:");
        for (String t : transactions) {
            if (t != null) {
                System.out.println(t);
            }
        }
    }

    // Add transaction to history (FIFO, keeps last 5 transactions)
    private void addTransaction(String transaction) {
        if (transactionCount == 5) {
            // Shift transactions to make space for a new one
            System.arraycopy(transactions, 1, transactions, 0, 4);
            transactions[4] = transaction;
        } else {
            transactions[transactionCount++] = transaction;
        }
    }
}

public class BankingApp {

    static Scanner scanner = new Scanner(System.in);

    // Menu-driven loop
    public static void bankingMenu(BankAccount account) {
        while (true) {
            System.out.println("\n=== Banking System Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Account Details");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine()); // Convert input to integer
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = Double.parseDouble(scanner.nextLine());
                    account.deposit(depositAmount);
                }
                case 2 -> {
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = Double.parseDouble(scanner.nextLine());
                    account.withdraw(withdrawAmount);
                }
                case 3 ->
                    account.displayDetails();
                case 4 -> {
                    System.out.println("Thank you for using the banking system!");
                    return; // Exit loop
                }
                default ->
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter initial deposit amount: ");
        double initialBalance = Double.parseDouble(scanner.nextLine());

        BankAccount userAccount = new BankAccount(name, initialBalance);
        bankingMenu(userAccount); // Start the banking menu
    }
}
