public class salary {
    
    public static void main(String[] args) {
         // var - automatically detects datatype

         var employeeName = "Kashish"; // String
         var baseSalary = 50000.00; // double
         var bonus = 5000;  // int
         var taxRate = 0.10; // double  (10% tax)

         // calculating total salary  
  
         double grossSalary = baseSalary + bonus;   //  addition
         double taxAmount = grossSalary * taxRate;  // multiplication
         double netSalary = grossSalary  - taxAmount; // subtraction


         // displaying the details 

         System.out.println("Employee Name: " + employeeName);
         System.out.println("Base Salary: \u20B9" + baseSalary);
         System.out.println("Bonus: \u20B9" + bonus);
         System.out.println("Gross Salary: \u20B9" + grossSalary);
         System.out.println("Tax Deducted (10%) : \u20B9" + taxAmount);
         System.out.println("Net Salary (After Tax): \u20B9" + netSalary);
    }
}
