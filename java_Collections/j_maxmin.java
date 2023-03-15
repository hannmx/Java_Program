package java_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class j_maxmin {
    public static void main(String[] args) {
        Random rand = new Random();
        List <Integer> arr_list = new ArrayList<Integer>();
        
        for (int i = 0; i < rand.nextInt(5, 10); i++) {     //создание списка
            arr_list.add(i, rand.nextInt(-100, 100));
        }
        int max = arr_list.get(0);
        int min = arr_list.get(0);
        int avg = 0;
        for (int i = 0; i < arr_list.size(); i++) {     //нахождение максимального и максимального элемента списка
            if (arr_list.get(i) > max) {
                max = arr_list.get(i);
            }
            if (arr_list.get(i) < min) {
                min = arr_list.get(i);
            }
            avg += arr_list.get(i);
        }
        avg = avg / arr_list.size();    //нахождение среднего элемента списка
        System.out.print("Изначальный массив: " + arr_list);
        System.out.print("\nМаксимальный элемент списка: " + max);
        System.out.print("\nМинимальный элемент списка: " + min);
        System.out.print("\nСредний элемент списка: " + avg);
    }
}
