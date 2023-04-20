package j_oop.java_ComplexNumberSOLID;

import java.util.logging.Logger;

public class Calculator {
    private static final Logger logger = Logger.getLogger(Calculator.class.getName());
    
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        logger.info(String.format("Add operation: %s + %s", a, b));
        Operation operation = new AddOperation();
        ComplexNumber result = operation.execute(a, b);
        logger.info(String.format("Result: %s", result));
        return result;
    }
    
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        logger.info(String.format("Multiply operation: %s * %s", a, b));
        Operation operation = new MultiplyOperation();
        ComplexNumber result = operation.execute(a, b);
        logger.info(String.format("Result: %s", result));
        return result;
    }
    
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        logger.info(String.format("Divide operation: %s / %s", a, b));
        Operation operation = new DivideOperation();
        ComplexNumber result = operation.execute(a, b);
        logger.info(String.format("Result: %s", result));
        return result;
    }
}