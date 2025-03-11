
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class employee {

    final int salary;
    final String name;

    public employee(String name, int salary) {
        this.salary = salary;
        this.name = name;
    }

}


public class filter{
    public static void main(String[] args) {
        List<employee> employees = Arrays.asList(
            new employee("Kashish", 60000),
            new employee("Kenil", 40000),
            new employee("Jahanvi", 70000)
        );

        List<employee> highEarners = employees.stream()
                                              .filter(emp -> emp.salary > 50000)
                                              .collect(Collectors.toList());

        highEarners.forEach(emp -> System.out.println(emp.name + " earns " + emp.salary));
    }
}