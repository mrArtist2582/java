interface Vehical{
    void start();
}

class Car implements  Vehical{
    @Override
    public  void start(){
        System.out.println("car");
    }
}

public  class using_Interface{
    public static void main(String[] args) {
        Vehical  myvehical = new  Car();
        myvehical.start();
    }
}