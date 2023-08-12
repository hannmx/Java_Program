package java_projects;

/*
 * Был добавлен массив intArray, чтобы не было ошибки при обращении к элементу. 
 * Также в выражении деления d был приведен к типу double, чтобы избежать деления на ноль.
 */

public class j_task2 {
    public static void main(String[] args) {
        try {
        int d = 0;
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        double catchedRes1 = intArray[8] / (double) d; // Переводим d в double для избежания деления на ноль
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }    
    }
}

