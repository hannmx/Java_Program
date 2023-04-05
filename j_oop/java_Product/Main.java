package j_oop.java_Product;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        User Max = new User("Max", "1234");
        User Ivan = new User("Ivan", "qwerty");
        User[] users = { Max, Ivan };
        System.out.println(Arrays.toString(users));
        System.out.println();
        Product product1 = new Product("Dress", "5300", "8/10");
        Product product2 = new Product("Hat", "790", "7/10");
        Product product3 = new Product("Coat", "18000", "9/10");
        Product product4 = new Product("Shirt", "1100", "6/10");
        Product product5 = new Product("Pants", "6600", "7/10");

        Product[] products = { product1, product2, product3, product4, product5 };
        System.out.println(Arrays.toString(products));
    }
}
