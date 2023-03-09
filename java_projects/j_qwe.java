/* Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, 
например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет. */

package java_projects;

import java.util.Scanner;
import java.util.regex.*;;

public class j_qwe {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);      //получение равенства от пользователя
        System.out.print("Введите выражение (Пример: 2? + ?5 = 69): ");
        String equation = read.nextLine();
        System.out.println("\nВаше выражение: " + equation);
        read.close();
        
        Pattern pat = Pattern.compile("[0-9|?]+(.[0-9|?]+)?");  //создание регулярного выражения
        Matcher matcher=pat.matcher(equation); 
        String[] array_equation = new String[3];    //массив для сохранения значений регулярного выражения

        for (int i = 0; i < 3; i++) {   //заполнение массива
            if (matcher.find()) {
                array_equation[i] = matcher.group();
            }           
        }
        
        pat = Pattern.compile("^[?]");  //новое регулярное выражение для замены ?

        for (int i = 0; i < 3; i++) {       //цикл для замены ? в значениях элементов массива
            matcher = pat.matcher(array_equation[i]);
            if (matcher.find()) {       //если ? в разряде десятков то заменяем на 1
                array_equation[i] = array_equation[i].replace("?", "1");
            }
            else {          //если ? в разряде единиц то заменяем на 0
                array_equation[i] = array_equation[i].replace("?", "0");
            }
        }

        int q = Integer.parseInt(array_equation[0]);    //сохранение значений в переменные
        int w = Integer.parseInt(array_equation[1]);
        int e = Integer.parseInt(array_equation[2]);

        int sum = q + w;
        if (sum > e) {
            System.out.println("Решений уравнения нет!");
        }
        else {
            if (q % 10 == 0 & w % 10 == 0) {    //если у двух чисел изменяется разряд единиц
                if (sum + 18 < e) {
                    System.out.println("Решений уравнения нет!");
                }
                else {
                    int count_w = w + 10;
                    int count_q = q + 10;
                    while (q + w != e) {
                        w = e - q - 1;
                        if (w >= count_w) {
                            w -= 10;
                        }
                        q = e - w;
                        if (q >= count_q) {
                            q -= 10;
                        }
                    }
                    sum = q + w;
                    System.out.println("Чтобы выражение принимало значение истино: ");  //вывод результата на консоль
                    System.out.println("q = " + q + "\nw = " + w);
                    System.out.println(q + " + " + w + " = " + e);
                    System.out.println(sum + " = " + e);
                }
            }
            if (q % 10 == 0 & w % 10 != 0) {    //первое число изменяется в разряде единиц, второе в разряде десятков
                boolean a = true;
                while (a) {
                    if (w < e - q) {
                        w += 10;
                    }
                    else {
                        w -= 10;
                        a = false;
                    }
                }
                while (q + w != e) {
                    q += 1;
                }
                sum = q + w;
                System.out.println("Чтобы выражение принимало значение истино: ");  //вывод результата на консоль
                System.out.println("q = " + q + "\nw = " + w);
                System.out.println(q + " + " + w + " = " + e);
                System.out.println(sum + " = " + e);
            }
            if (q % 10 != 0 & w % 10 == 0) {    //второе число изменяется в разряде единиц, первое в разряде десятков
                boolean a = true;
                while (a) {
                    if (q < e - w) {
                        q += 10;
                    }
                    else {
                        q -= 10;
                        a = false;
                    }
                }
                while (q + w != e) {
                    w += 1;
                }
                sum = q + w;
                System.out.println("Чтобы выражение принимало значение истино: ");  //вывод результата на консоль
                System.out.println("q = " + q + "\nw = " + w);
                System.out.println(q + " + " + w + " = " + e);
                System.out.println(sum + " = " + e);
            }
            if (q % 10 != 0 & w % 10 != 0) {    //если у двух чисел изменяется разряд десятков
                while (q + w != e) {
                    if (w + q > e) {
                        System.out.println("Решений уравнения нет!");
                        break;   
                    }
                    if (w < q) {
                        w += 10;
                        q += 10;
                    }
                    else {
                        w += 10;
                        q += 20;
                    }
                }
                sum = q + w;
                System.out.println("Чтобы выражение принимало значение истино: ");  //вывод результата на консоль
                System.out.println("q = " + q + "\nw = " + w);
                System.out.println(q + " + " + w + " = " + e);
                System.out.println(sum + " = " + e);
                }
            }
        }
        
    }

