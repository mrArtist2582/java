
abstract class phone {

    abstract void call(String number);
}

class samrtphone extends phone {

    @Override
    void call(String number) {
        System.out.println("Calling " + " " + number + " using 5g technology");
    }
}

public class calling {

    public static void main(String[] args) {
        phone myphone = new samrtphone();
        myphone.call(" 123344434");
    }
}
