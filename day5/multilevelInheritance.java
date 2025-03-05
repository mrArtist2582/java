// Grandparent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}


class Elephent extends Animal {
    void sleep() {
        System.out.println("This Elephent sleeps.");
    }
}


class Dog extends Elephent {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class multilevelInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   
        dog.sleep(); 
        dog.bark();  
    }
}
