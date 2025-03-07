
class Car {

    class musicPlayer {

        void playmusic() {
            System.out.println("music is started...");
        }
    }
}

public class inner_class {

    public static void main(String[] args) {
        Car mycar = new Car();
        Car.musicPlayer musicPlayer = mycar.new musicPlayer();
        musicPlayer.playmusic();
    }
}
