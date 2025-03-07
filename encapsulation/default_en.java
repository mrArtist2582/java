
class employee {

    String name;

    //setter
    void setName(String name) {
        this.name = name;
    }

    //getter
    String getName() {
        return name;
    }
}

public class default_en {

    public static void main(String[] args) {
        employee en = new employee();
        en.setName("Kasihsh");
        System.out.println(en.getName());
    }
}
