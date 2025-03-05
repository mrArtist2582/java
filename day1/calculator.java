
import java.util.Scanner;

public class calculator {
    @SuppressWarnings("ConvertToTryWithResources")
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking first number input
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        
        // Taking second number input
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        
        // Taking operation input
        System.out.print("Choose Operation ( (1) +, (2) -, (3) *,(4) /): ");
        char operation = sc.next().charAt(0);
        
        double result = 0;
        boolean validOperation = true;

        // Performing the chosen operation
        switch (operation) {
            case '1' -> result = num1 + num2;
            case '2' -> result = num1 - num2;
            case '3' -> result = num1 * num2;
            case '4' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
            }
            default -> {
                System.out.println("Error: Invalid operation selected.");
                validOperation = false;
            }
        }
        
        // Displaying the result if operation was valid
        if (validOperation) {
            System.out.println("Result: " + result);
        }
        
        sc.close(); // Closing scanner
    }
}
