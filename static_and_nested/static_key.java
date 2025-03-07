
class Bank {

    static double interestRate = 7.5;

    static void showInterestRate() {

        System.out.println("Current Interest rete is : " + interestRate+"%");

    }

}

public class static_key {

    public static void main(String[] args) {
        Bank.showInterestRate();
    }
}
