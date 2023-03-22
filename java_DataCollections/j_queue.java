package java_DataCollections;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class j_queue {
    public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>();
            Random random = new Random();
            Scanner in = new Scanner(System.in);
            System.out.print("Изначальный список: ");
            int size = random.nextInt(5, 10);
            
            for (int i = 0; i < size; i++) {
                list.add(random.nextInt(0, 21));
            }
            System.out.println(list);
            System.out.print("Выберите действие, которое хотите сделать с очередью:" 
            + "\n1 - поместить новый элемент в конец очереди "
            + "\n2 - удалить первый элемент из очереди" 
            + "\n3 - вывести первый элемент очереди\nВаш выбор: ");
            String choice = in.nextLine();
            in.close();
            switch (choice) {
                case "1":
                    enqueue(list);
                    System.out.print("Очередь с новым рандомным элементом: " + list);
                    break;
                case "2":
                    System.out.println("Удаляется первый элемент очереди: " + dequeue(list)); 
                    System.out.print("Очередь без первого элемента: " + list);
                break;
                case "3":
                    System.out.println("Первый элемент очереди: " + first(list)); 
                break;
                default:
                    System.out.print("Вы не выбрали действие с очередью!");
            }
    }
    public static void enqueue(LinkedList<Integer> ls) {
        Random rand = new Random();
        ls.add(rand.nextInt(0, 21));
    }
    public static int dequeue(LinkedList<Integer> ls) {
        int num = ls.get(0);
        ls.remove(0);
        return num;
    }
    public static int first(LinkedList<Integer> ls) {
        int num = ls.get(0);
        return num;
    }
}
