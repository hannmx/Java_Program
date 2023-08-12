package java_projects;

import java.util.Scanner;

public class j_float {
    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float input = 0.0f;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Введите дробное число: ");
                input = Float.parseFloat(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода. Пожалуйста, введите корректное дробное число.");
            }
        }
        scanner.close();
        return input;
        
    }

    public static void main(String[] args) {
    float floatValue = getFloatInput();
    System.out.println("Введенное дробное число: " + floatValue);
}

}

