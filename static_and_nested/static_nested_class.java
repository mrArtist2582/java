
class Car {

    static class Engine {

        void start() {
            System.out.println("Engine is started");
        }
    }
}

public class static_nested_class {

    public static void main(String[] args) {
        Car.Engine myEngine = new Car.Engine();
        myEngine.start();
    }
}
