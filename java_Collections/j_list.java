package java_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class j_list {
    public static void main(String[] args) {
        Random rand = new Random();
        List <Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < rand.nextInt(2, 21); i++) {
            list.add(i, rand.nextInt(1, 100));
        }
        System.out.println("Изначальный массив: " + list);
        
        list.removeIf(n -> (n % 2) == 0);
        System.out.print("Массив без четных элементов: " + list);
    }
}
