package  example;
import java.util.Scanner;
public class reverse {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString(); // Reverse the string using StringBuilder
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Reversed: " + reverseString(input));
        
        scanner.close();
    }
}
