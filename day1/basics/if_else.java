import java.util.Scanner;

public class if_else {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
         int age = sc.nextInt();
         if(age >= 18){
             System.out.println("You are eligible for a driving license");
         }
            else{
                System.out.println("You are not eligible for a driving license");
            }

            System.out.println("Enter the age to check  ticket price: ");
            int ticketAge = sc.nextInt();
            if(ticketAge  <5){
                System.out.println("ticket is free");
            }
            else if(ticketAge >= 5  && ticketAge <= 12){
                System.out.println("Ticket price is 150");
            }
            else if(ticketAge >= 20 && ticketAge <= 60){
                System.out.println("Ticket price is 200");
            }
            else{
                System.out.println("Ticket price is 250");  
            }

            sc.close();
    }
}
