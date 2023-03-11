package java_API;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;


public class j_sort {

    public static void PrintArray(int[] arr) {  //метод вывода на экран, полученного массива

        for (int i = 0; i < arr.length; i++) {  
            System.out.print(" " + arr[i]); 
        }
        System.out.println();   
    }
    public static int[] SortArray(int[] arr){
        for(int k = 0; k < arr.length-1; k++) {
            
            for (int i = 0; i < arr.length - k - 1; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) throws IOException{
        
        Logger log = Logger.getLogger(j_sort.class.getName());      //создание логгера для фиксации работы программы
        FileHandler filehand = new FileHandler("logFile.xml");
        Scanner in = new Scanner(System.in);
        
        log.addHandler(filehand);
        XMLFormatter xml = new XMLFormatter();
        filehand.setFormatter(xml);
        log.info("Sort Array");
        System.out.print("Введите количество элементов массива: ");
        int size = in.nextInt();
        System.out.print("\nВведите элементы массива (через пробел): ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        in.close(); 
        System.out.print("\nЗаполненный массив:");
        PrintArray(array);
        System.out.print("\nОтсортированный массив: ");
        
        PrintArray(SortArray(array)); 
    }
}

