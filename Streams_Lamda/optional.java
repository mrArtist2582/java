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

public class optional
 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Kirtan", 40000),
            new Employee("Jahanvi", 60000),
            new Employee("Kashish", 70000)
        );

        Optional<Employee> employee = employees.stream()
                                               .filter(emp -> emp.name.equals("Kashish"))
                                               .findFirst();

        employee.ifPresent(emp -> System.out.println(emp.name + " earns " + emp.salary));
    }
}
