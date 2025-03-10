import java.util.ArrayList;
import java.util.List;

class Product {
    public void display() {
        System.out.println("This is a product.");
    }
}

class Electronics extends Product {
    @Override
    public void display() {
        System.out.println("This is an electronic product.");
    }
}

class Warehouse {
  
    public static void showProducts(List<? extends Product> list) {
        for (Product p : list) {
            p.display();
        }
    }
}

public class wildCard {
    public static void main(String[] args) {
        List<Electronics> electronicsList = new ArrayList<>();
        electronicsList.add(new Electronics());

        Warehouse.showProducts(electronicsList);  
    }
}
