
abstract class Car {

    abstract void start();
}

class Tesla extends Car {

    @Override
    void start() {
        System.out.println("Tesla Starts");
    }
}

public class example {

    public static void main(String[] args) {
        Car mycar = new Tesla();
        mycar.start();
    }
}
