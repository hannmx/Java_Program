package j_oop.java_ComplexNumberSOLID;

public class Main {
    public static void main(String[] args) {
        ComplexNumberFactory factory = new ComplexNumberFactory();
        ComplexNumber a = factory.createComplexNumber(3, 4);
        ComplexNumber b = factory.createComplexNumber(2, -1);
        Calculator calculator = new Calculator();
        calculator.add(a, b);       // Output: Add operation: 3.00 + 4.00i + 2.00 - 1.00i | Result: 5.00 + 3.00i
        calculator.multiply(a, b);  // Output: Multiply operation: 3.00 + 4.00i * 2.00 - 1.00i | Result: 10.00 + 5.00i
        calculator.divide(a, b);    // Output: Divide operation: 3.00 + 4.00i / 2.00 - 1.00i | Result: 1.10 + 1.70i
    }
}
