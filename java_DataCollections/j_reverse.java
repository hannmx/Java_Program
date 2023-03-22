package java_DataCollections;

import java.util.LinkedList;
import java.util.Random;

public class j_reverse {
        public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>();
            Random random = new Random();
            System.out.print("Изначальный список: ");
            int size = random.nextInt(5, 21);
            for (int i = 0; i < size; i++) {
                list.add(random.nextInt(0, 100));
            }
            System.out.println(list);
            System.out.print("Перевернутый список: [ ");
            for (int i = 0; i < size - 1; i++) {
                System.out.print(list.getLast() + " ");
                list.removeLast();
            }
            System.out.print("]");
        }
        
}

