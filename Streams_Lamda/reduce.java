import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class reduce {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Kenil", 40000),
            new Employee("Kirtan", 60000),
            new Employee("Kashish", 70000)
        );

        Optional<Employee> highestPaidEmployee = employees.stream()
                                                          .reduce((emp1, emp2) -> emp1.salary > emp2.salary ? emp1 : emp2);

        highestPaidEmployee.ifPresent(emp -> 
            System.out.println("Highest Paid Employee: " + emp.name + " with salary " + emp.salary)
        );
    }
}
