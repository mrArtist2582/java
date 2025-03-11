
import java.util.*;
import java.util.stream.Collectors;

class Product {

    private final String name;
    private final String category;
    private double price;
    private final double rating;

    public Product(String name, String category, double price, double rating) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }

    public Product(String category, String name, double rating) {
        this.category = category;
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return name + " | " + category + " | $" + price + " | Rating: " + rating;
    }
}

public class product_filtering {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("iPhone 13", "Electronics", 999.99, 4.8),
                new Product("Samsung TV", "Electronics", 750.50, 4.5),
                new Product("Nike Shoes", "Fashion", 120.0, 4.2),
                new Product("Adidas T-Shirt", "Fashion", 35.99, 4.1),
                new Product("MacBook Air", "Electronics", 1249.00, 4.9),
                new Product("Sony Headphones", "Electronics", 199.99, 4.4),
                new Product("Levi's Jeans", "Fashion", 59.99, 4.0)
        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Filter by category (Electronics/Fashion)");
        System.out.println("2. Filter by price range");
        System.out.println("3. Sort by price (Ascending)");
        System.out.println("4. Sort by price (Descending)");
        System.out.println("5. Sort by rating (Highest first)");

        int choice = scanner.nextInt();

        List<Product> result ;

        switch (choice) {
            case 1 -> {
                System.out.print("Enter category: ");
                String category = scanner.next();
                result = products.stream()
                        .filter(p -> p.getCategory().equalsIgnoreCase(category))
                        .collect(Collectors.toList());
            }

            case 2 -> {
                System.out.print("Enter minimum price: ");
                double minPrice = scanner.nextDouble();
                System.out.print("Enter maximum price: ");
                double maxPrice = scanner.nextDouble();
                result = products.stream()
                        .filter(p -> p.getPrice() >= minPrice && p.getPrice() <= maxPrice)
                        .collect(Collectors.toList());
            }

            case 3 ->
                result = products.stream()
                        .sorted(Comparator.comparing(Product::getPrice))
                        .collect(Collectors.toList());

            case 4 ->
                result = products.stream()
                        .sorted(Comparator.comparing(Product::getPrice).reversed())
                        .collect(Collectors.toList());

            case 5 ->
                result = products.stream()
                        .sorted(Comparator.comparing(Product::getRating).reversed())
                        .collect(Collectors.toList());

            default -> {
                System.out.println("Invalid choice.");
                return;
            }
        }

        System.out.println("\nFiltered/Sorted Products:");
        result.forEach(System.out::println);
    }
}
