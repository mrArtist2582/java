import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    students.add(name);
                    System.out.println(name + " added successfully!");
                }
                case 2 -> {
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("\nList of Students:");
                        for (int i = 0; i < students.size(); i++) {
                            System.out.println((i + 1) + ". " + students.get(i));
                        }
                    }
                }
                case 3 -> {
                    if (students.isEmpty()) {
                        System.out.println("No students available to update.");
                    } else {
                        System.out.print("Enter student number to update: ");
                        int index = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        if (index > 0 && index <= students.size()) {
                            System.out.print("Enter new name: ");
                            String newName = scanner.nextLine();
                            students.set(index - 1, newName);
                            System.out.println("Student updated successfully!");
                        } else {
                            System.out.println("Invalid student number.");
                        }
                    }
                }
                case 4 -> {
                    if (students.isEmpty()) {
                        System.out.println("No students available to delete.");
                    } else {
                        System.out.print("Enter student number to delete: ");
                        int index = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        if (index > 0 && index <= students.size()) {
                            String removedStudent = students.remove(index - 1);
                            System.out.println(removedStudent + " removed successfully!");
                        } else {
                            System.out.println("Invalid student number.");
                        }
                    }
                }
                case 5 -> {
                    System.out.println("Exiting... Have a great day!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
