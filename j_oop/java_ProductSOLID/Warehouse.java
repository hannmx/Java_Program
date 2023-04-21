package j_oop.java_ProductSOLID;

// Warehouse.java

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<Product, Integer> products;

    public Warehouse() {
        products = new HashMap<>();
    }

    // Методы для управления товарами на складе
    public void addProduct(Product product, int quantity) {
        if (products.containsKey(product)) {
            products.put(product, products.get(product) + quantity);
        } else {
            products.put(product, quantity);
        }
    }

    public void removeProduct(Product product, int quantity) {
        if (products.containsKey(product)) {
            int currentQuantity = products.get(product);
            if (currentQuantity >= quantity) {
                products.put(product, currentQuantity - quantity);
            } else {
                throw new IllegalArgumentException("Not enough quantity available");
            }
        } else {
            throw new IllegalArgumentException("Product not found in warehouse");
        }
    }

    // Геттер для получения остатка товаров на складе
    public int getProductQuantity(Product product) {
        if (products.containsKey(product)) {
            return products.get(product);
        } else {
            return 0;
        }
    }

    
}

