package java_Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class j_phone{
    
       // Метод, который добавляет номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        Scanner in = new Scanner(System.in);
        boolean bool = true;
        String ch;
        while(bool) {
            System.out.println("Выберите действие с телефонным справочником:"
            + "\n1 - Добавить запись в справочник" 
            + "\n2 - Вывести все записи справочника"
            + "\n3 - Удалить запись справочника"
            + "\n4 - Выход");
            ch = in.nextLine();
            switch (ch){
                case "1":
                    System.out.println("Введите имя, а затем номер: ");
                    addNumber(in.nextLine(), in.nextInt(), bookPhone);
                    break;
                case "2":
                    System.out.println("Телефонный справочник: ");
                    printBook(bookPhone);
                    break;
                case "3":
                    System.out.println("Введите имя, чтобы удадить запись: ");
                    bookPhone.remove(in.nextLine());    
                    break;
                case "4":
                    System.out.println("\nСпасибо!");
                    bool = false;
                    break;
            } 
        }
        in.close();
       }
}