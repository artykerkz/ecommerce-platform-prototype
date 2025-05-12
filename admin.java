package ecommerce;

import java.util.List;

public class Admin extends User {
    public Admin(String username, String email) {
        super(username, email);
    }

    public void removeProduct(Product product, List<Product> inventory) {
        inventory.remove(product);
    }
}
