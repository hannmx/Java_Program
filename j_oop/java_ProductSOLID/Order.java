package j_oop.java_ProductSOLID;

// Order.java

public class Order {
    private Warehouse warehouse;

    public Order(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    // Метод для обработки заказа
    public void processOrder(Product product, int amount) {
        // Проверяем наличие товара на складе
        int availableQuantity = warehouse.getProductQuantity(product);
        if (availableQuantity >= amount) {
            // Уменьшаем количество товара на складе
            warehouse.removeProduct(product, amount);
        } else {
            throw new IllegalArgumentException("Not enough quantity available in warehouse");
        }
    }
}

