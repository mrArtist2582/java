import java.util.*;

// Employee Class
class Employee {
    private final int id;
    private final String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public String getDepartment() { return department; }

    public void setSalary(double salary) { this.salary = salary; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: $" + salary + ", Dept: " + department;
    }
}


class EmployeeManagement {
    private final List<Employee> employees = new ArrayList<>();
    private int nextId = 101; 

 
    public void addEmployee(String name, double salary, String department) {
        employees.add(new Employee(nextId++, name, salary, department));
        System.out.println("Employee added successfully!");
    }


    public void listEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        System.out.println("\nEmployee List:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }


    public void updateEmployee(int id, double newSalary, String newDepartment) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                e.setSalary(newSalary);
                e.setDepartment(newDepartment);
                System.out.println("Employee updated successfully!");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }


    public void deleteEmployee(int id) {
        employees.removeIf(e -> e.getId() == id);
        System.out.println("Employee deleted successfully!");
    }


    public void sortByName() {
        employees.sort(Comparator.comparing(Employee::getName));
        System.out.println("Employees sorted by name.");
        listEmployees();
    }


    public void sortBySalary() {
        employees.sort(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Employees sorted by salary.");
        listEmployees();
    }


    public void filterByDepartment(String department) {
        System.out.println("\nEmployees in Department: " + department);
        employees.stream()
                 .filter(e -> e.getDepartment().equalsIgnoreCase(department))
                 .forEach(System.out::println);
    }
}

// Main Class
public class employeeManagementsystem {
    public static void main(String[] args) {
        EmployeeManagement em = new EmployeeManagement();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. List Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Sort by Name");
            System.out.println("6. Sort by Salary");
            System.out.println("7. Filter by Department");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine(); 
                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();
                    em.addEmployee(name, salary, department);
                }

                case 2 -> em.listEmployees();

                case 3 -> {
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter New Salary: ");
                    double newSalary = sc.nextDouble();
                    sc.nextLine(); 
                    System.out.print("Enter New Department: ");
                    String newDepartment = sc.nextLine();
                    em.updateEmployee(id, newSalary, newDepartment);
                }

                case 4 -> {
                    System.out.print("Enter Employee ID to Delete: ");
                    int delId = sc.nextInt();
                    em.deleteEmployee(delId);
                }

                case 5 -> em.sortByName();

                case 6 -> em.sortBySalary();

                case 7 -> {
                    System.out.print("Enter Department to Filter: ");
                    String filterDept = sc.nextLine();
                    em.filterByDepartment(filterDept);
                }

                case 8 -> {
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
