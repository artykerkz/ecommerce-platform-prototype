package ecommerce;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> inventory = new ArrayList<>();
        inventory.add(new Electronics(1, "Laptop", 999.99, "Dell", 24));
        inventory.add(new Clothing(2, "Jeans", 49.99, "M", "Denim"));
        inventory.add(new Grocery(3, "Milk", 2.99, 1.0, LocalDate.of(2025, 6, 1)));

        Customer c1 = new Customer("artina", "artina@example.com");
        c1.addToCart(inventory.get(0));
        c1.addToCart(inventory.get(1));
        c1.checkout();

        // Search and sort demo
        System.out.println("\nSearch for 'Lap':");
        inventory.stream()
                .filter(p -> p.getName().toLowerCase().contains("lap"))
                .forEach(p -> System.out.println(p.getDetails()));

        System.out.println("\nSorted by Price:");
        inventory.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .forEach(p -> System.out.println(p.getDetails()));
    }
}
