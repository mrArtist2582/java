
class ShoppingCart<T> {  
    private T item;

    public void addItem(T item) {
        this.item = item;
        System.out.println("Added to cart: " + item);
    }

    public T getItem() {
        return item;
    }
}

// Main class
public class gen {
    public static void main(String[] args) {
        ShoppingCart<String> cart1 = new ShoppingCart<>();
        cart1.addItem("Laptop");  

        ShoppingCart<Integer> cart2 = new ShoppingCart<>();
        cart2.addItem(1001);  
    }
}
