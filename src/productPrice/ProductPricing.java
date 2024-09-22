package productPrice;

import java.util.HashMap;
import java.util.Map;

public class ProductPricing {

    private Map<String,Double> productPrices;

    public ProductPricing(){
        productPrices = new HashMap<>();
    }

    public void addProduct(String productName, double price){
        productPrices.put(productName,price);
    }

    public double totalPrice(){
        double total = 0.0;
        for (Double value : productPrices.values()) {
            total += value;

        }return total;
    }

    @Override
    public String toString() {
        return "ProductPricing{" +
                "productPrices=" + productPrices +
                '}';
    }
}
