package j_oop.java_Product;

public class Basket {
    Product [] buyProducts = new Product[3];

    public Basket(Product[] buyProducts) {
        this.buyProducts = buyProducts;
    }

    public Basket() {
        
    }

    public Product[] getBuyProducts() {
        return buyProducts;
    }

    public void setBuyProducts(Product[] buyProducts) {
        this.buyProducts = buyProducts;
    }
}
