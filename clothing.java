package ecommerce;

public class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(int id, String name, double price, String size, String material) {
        super(id, name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public String getDetails() {
        return name + " (Clothing) - Size: " + size + ", Material: " + material;
    }
}
