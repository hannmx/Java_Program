package j_oop.java_Calculator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(sum); // Выводит "15"
        int multiply = calculator.multiply(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(multiply); // Выводит "120"
        double divide = calculator.divide(Arrays.asList(10, 2, 5));
        System.out.println(divide); // Выводит "1.0"
        String binary = calculator.binary(7);
        System.out.println(binary);
    }
}
