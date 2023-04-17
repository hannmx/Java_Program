package j_oop.java_Calculator;

import java.util.List;

public class Calculator {
    public int sum(List<Integer> values) {
        int result = 0;
        for (int value : values) {
            result += value;
        }
        return result;
    }
    
    public int multiply(List<Integer> values) {
        int result = 1;
        for (int value : values) {
            result *= value;
        }
        return result;
    }
    
    public double divide(List<Integer> values) {
        double result = values.get(0);
        for (int i = 1; i < values.size(); i++) {
            result /= values.get(i);
        }
        return result;
    }
    
    public String binary(String value) {
        int intValue;
        try {
            intValue = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            try {
                intValue = (int) Math.round(Double.parseDouble(value));
            } catch (NumberFormatException ex) {
                throw new IllegalArgumentException("Invalid input value: " + value);
            }
        }
        return Integer.toBinaryString(intValue);
    }
    
    public String binary(int value) {
        return Integer.toBinaryString(value);
    }
}
