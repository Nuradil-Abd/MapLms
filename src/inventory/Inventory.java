package inventory;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<String, Integer> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    public void addInventory (String productName, int quantity){
        products.put(productName,quantity);
    }

    public void updateQuantity (String productName, int quantity){
        products.put(productName,quantity);
    }

    public boolean isProductOutOfStock(String productName){
        return products.getOrDefault(productName, 0) == 0;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "products=" + products +
                '}';
    }
}
