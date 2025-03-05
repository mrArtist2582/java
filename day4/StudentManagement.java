
class Student {

    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display student details
    void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("-----------------------------");
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        Student student1 = new Student("Kashish", 101, 96.5);
        Student student2 = new Student("kirtan", 102, 78.0);
        Student student3 = new Student("Krunal", 103, 92.3);
        Student student4 = new Student("Kaushal", 104, 95.3);

        System.out.println("=== Student Details ===");
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
        student4.displayStudentInfo();
    }
}
