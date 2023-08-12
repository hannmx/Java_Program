package java_projects;

/*
 * Был добавлен импорт java.io.FileNotFoundException, так как метод printSum может вызвать это исключение.
 В методе main в задании 3 был исправлен индекс при доступе к элементу массива abc, чтобы избежать IndexOutOfBoundsException.
Порядок catch блоков был изменен так, чтобы более конкретные типы исключений обрабатывались перед более общими типами (Throwable).
 */
import java.io.FileNotFoundException;

public class j_task3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[2] = 9; // Исправляем индекс для доступа к третьему элементу
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) { // Более общий тип исключения должен идти последним
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
}
