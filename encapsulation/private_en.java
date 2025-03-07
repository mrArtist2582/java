
class BankAccount {

    private double balance = 0;

    // setter method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    // gettter method
    public double getBalanace() {
        return balance;
    }
}

public class private_en {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(5000);
        System.out.println("balance : " + account.getBalanace());
    }
}
