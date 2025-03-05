
class Person {
  String name;
  
  void display() {
      System.out.println("Name: " + name);
  }
}


class Student extends Person {
  int rollNumber;

  void show() {
      System.out.println("Roll Number: " + rollNumber);
  }
}

// Main class
public class singleInheritance {
  public static void main(String[] args) {
      Student student = new Student();
      student.name = "Kashish";
      student.rollNumber = 101;

      student.display();
      student.show();
  }
}