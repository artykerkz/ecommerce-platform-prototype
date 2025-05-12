package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private List<Product> cart = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    public Customer(String username, String email) {
        super(username, email);
    }

    public void addToCart(Product product) {
        cart.add(product);
    }

    public List<Product> getCart() {
        return cart;
    }

    public void checkout() {
        Order order = new Order(cart);
        orders.add(order);
        cart.clear();
        System.out.println("Order placed! Total: $" + order.getFinalTotal());
    }
}
