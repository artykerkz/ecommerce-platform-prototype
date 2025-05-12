package ecommerce;

import java.time.LocalDate;

public class Grocery extends Product {
    private double weight;
    private LocalDate expiryDate;

    public Grocery(int id, String name, double price, double weight, LocalDate expiryDate) {
        super(id, name, price);
        this.weight = weight;
        this.expiryDate = expiryDate;
    }

    @Override
    public String getDetails() {
        return name + " (Grocery) - Weight: " + weight + "kg, Expires: " + expiryDate;
    }
}
