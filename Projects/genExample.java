import java.util.ArrayList;
import java.util.List;

// Student class
class Student {
    private final String name;
    private final int id;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}

class StudentCollection {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Added: " + student);
    }

    
    public void removeStudent(int id) {
        students.removeIf(student -> student.getId() == id);
        System.out.println("Removed student with ID: " + id);
    }

    public void displayStudents() {
        System.out.println("\nStudent List:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}


public class genExample {
    public static void main(String[] args) {
        StudentCollection studentList = new StudentCollection();

 
        studentList.addStudent(new Student(101, "Kashish"));
        studentList.addStudent(new Student(102, "Jahanvi"));
        studentList.addStudent(new Student(103, "Kirtan"));

        studentList.displayStudents();

 
        studentList.removeStudent(102);

        studentList.displayStudents();
    }
}
