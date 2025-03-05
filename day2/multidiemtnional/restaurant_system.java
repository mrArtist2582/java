package multidiemtnional;

public class restaurant_system {
    public static void main(String[] args) {
        // List of food items available
        String[] foodItems = {"Burger", "Pizza", "Pasta"};

        //  multiple customers [Customer][Food Item][Price, Quantity]
        double[][][] orders = {
            { {5.99, 2}, {8.49, 1}, {6.29, 3} }, 
            { {5.99, 1}, {8.49, 2}, {6.29, 1} }, 
            { {5.99, 3}, {8.49, 1}, {6.29, 2} }  
        };

        // Loop through each customer's order
        for (int customer = 0; customer < orders.length; customer++) {
            System.out.println("Customer " + (customer + 1) + " Order:");
            double totalBill = 0;

           
            for (int i = 0; i < foodItems.length; i++) {
                double price = orders[customer][i][0]; 
                int quantity = (int) orders[customer][i][1];
                double cost = price * quantity; 
                totalBill += cost;

                
                System.out.println(foodItems[i] + " - $" + price + " x " + quantity + " = $" + cost);
            }

           
            System.out.println("Total Bill for Customer " + (customer + 1) + ": $" + totalBill);
            System.out.println("---------------------------------");
        }
    }
}
