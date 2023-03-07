/* Реализовать простой калькулятор */
package java_projects;

import java.util.Scanner;

public class j_calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = in.nextDouble();
        System.out.print("Введите второе число: ");
        double b = in.nextDouble();
        System.out.println("\nВыберите действие (+, -, *, /): ");
        char choice = in.next().charAt(0);
        in.close();
        double res = 0;
        switch (choice) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
            default:
                System.out.println("\nОшибка! Введите нужную верную операцию! (+, -, *, /)");
                return;
        }
        System.out.println(a + " " + " " + choice + " " + b + " = " + res);
    }
}
