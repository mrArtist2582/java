// Purpose: This program checks if a number is even or odd.


import java.util.Scanner;

public class OddEvenChecker {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Asking the user for a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Checking if the number is even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is an Even number.");
        } else {
            System.out.println(num + " is an Odd number.");
        }

        
        sc.close();
    }
}
