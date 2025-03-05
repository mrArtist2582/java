// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child class 1
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

// Child class 2
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding.");
    }
}

// Main class
public class hierarchicalInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        car.start();
        car.drive();

        bike.start();
        bike.ride();
    }
}
