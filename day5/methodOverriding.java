/* 
   method ovverriding :-  the method having same name with same parameter.
                          also known as runtime polymorphism
*/

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}


class Dog extends Animal {
   
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog(); 

        myAnimal.makeSound();
        myDog.makeSound();     
    }
}
