
import java.util.Scanner;

public class loop {
  
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
         // for loop
            System.out.println("Enter the number to print the mulitiplication table: ");
            int num = sc.nextInt();

            System.out.println("Multiplication table of " + num  + " : ");
            for(int i = 1;  i<= 10; i++){
                System.out.println(num + " x " + i + " = " + (num * i));
            }
            sc.close();
    }
}
