package java_Hash;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {

        Employee employee1 = new Employee("AAA", 30);
        System.out.println(employee1.hashCode());

        j_HashMap<String, String> hashMap = new j_HashMap<>(4);


        String v = hashMap.put("+79005551122", "Александр");
        v = hashMap.put("+79005551123", "Сергей");
        v = hashMap.put("+79005551123", "Алексей");
        v = hashMap.put("+79005551124", "Александр1");
        v = hashMap.put("+79005551125", "Александр2");
        v = hashMap.put("+79005551126", "Александр3");
        v = hashMap.put("+79005551127", "Александр4");
        v = hashMap.put("+79005551128", "Александр5");


        String searchRes = hashMap.get("+790055511221");

        v = hashMap.remove("+79005551127");

        for (Object e: hashMap) {

        }

        // Перебор всех элементов с помощью цикла foreach
    for (HashMap.Entry<String, Integer> entry : hashMap) {
        String key = entry.getKey();
        Integer value = entry.getValue();
        System.out.println("Key: " + key + ", Value: " + value);
    }

    }

}

