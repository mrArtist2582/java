
import java.util.Scanner;

public class whilw_loop {
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int balance = 5000; 
          System.out.println("\nYour current balance is: \u20B9 " + balance);
           
          while(balance >0) {
            System.out.println("Enter the amount you want to withdraw:( or 0 to exit) ");
             int withdraw = sc.nextInt();
              if(withdraw == 0) {
                break;
              }
              else if(withdraw > balance) {
                System.out.println("Insufficient balance");
             
              }
              else {
                balance -= withdraw;
                System.out.println("Your current balance is: ₹" + balance);
              }
             
          }
          sc.close();
    }
}
