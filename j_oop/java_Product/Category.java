package j_oop.java_Product;

public class Category {
    String categoryName;
    Product [] products = new Product[3];

    public Category(String categoryName, Product[] products) {
        this.categoryName = categoryName;
        this.products = products;
    }

    public Category() {

    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Product[] getProduct() {
        return products;
    }

    public void setProduct(Product[] products) {
        this.products = products;
    }
}
