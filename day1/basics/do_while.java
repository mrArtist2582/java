
import java.util.Scanner;


public class do_while {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int enterdPin;

        do{
            System.out.println("Enter your 4 digit pin: ");
              enterdPin = sc.nextInt();

              if(enterdPin != correctPin){
                System.out.println("Incorrect pin, try again");
              }
        }
        while(enterdPin!= correctPin);

        System.out.println("PIN verified. Access granted");
        sc.close();
    }


}
