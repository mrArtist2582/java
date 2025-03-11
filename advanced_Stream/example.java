
import java.util.*;
import java.util.stream.Collectors;

class Employee {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class example {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Kashish"),
                new Employee(102, "Kiratn"),
                new Employee(103, "Jahanvi")
        );

        // Convert List to Map (ID -> Name)
        Map<Integer, String> employeeMap = employees.stream()
                .collect(Collectors.toMap(emp -> emp.id, emp -> emp.name));

        employeeMap.forEach((id, name) -> System.out.println("ID: " + id + ", Name: " + name));
    }
}
