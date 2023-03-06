/* Вычисление n-го треугольного числа (сумма чисел от 1 до n) */
package java_projects;

import java.util.Scanner;

public class j_program {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        int n = in.nextInt();
        in.close();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.print("Сумма чисел от 1 до " + n + " равна " + sum);
    }
}
