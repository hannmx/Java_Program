package java_DataCollections;

import java.util.Scanner;

public class j_calc_v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double res = in.nextDouble();
        System.out.print("Введите второе число: ");
        double second = in.nextDouble();
        int count = 0;
        boolean bool = true;
        while (bool) {
            if (bool == true) {
                System.out.print("Введите число: ");
                second = in.nextDouble();
                System.out.print("\nВыберите действие (+, -, *, /) или нажмите 0 для удаления последнего действия: ");
                char choice = in.next().charAt(0);
                switch (choice) {
                    case '+':
                        res = res + second;
                        count++;
                        System.out.print("После " + count + " действия результат равен: " + res);
                        break;
                    case '-':
                        res = res - second;
                        count++;
                        System.out.print("После " + count + " действия результат равен: " + res);
                        break;
                    case '*':
                        res = res * second;
                        count++;
                        System.out.print("После " + count + " действия результат равен: " + res);
                        break;
                    case '/':
                        res = Math.round(res / second);
                        count++;
                        System.out.print("После " + count + " действия результат равен: " + res);
                        break;
                    default:
                        System.out.println("\nОшибка! Введите правильную операцию! (+, -, *, /)");
                        break;
                }
            } else {
                bool = false;
                in.close();
                System.out.println("Ответ: " + res);
            }
        }

    }
}
