package ecommerce;

public class Electronics extends Product {
    private String brand;
    private int warrantyMonths;

    public Electronics(int id, String name, double price, String brand, int warrantyMonths) {
        super(id, name, price);
        this.brand = brand;
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getDetails() {
        return name + " (Electronics) - Brand: " + brand + ", Warranty: " + warrantyMonths + " months";
    }
}
