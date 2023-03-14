package java_Collections;

import java.util.Random;
import java.util.Scanner;

public class j_merge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: "); //получаем от пользователя количество элементов массива
        int size = in.nextInt();
        in.close();
        Random rand = new Random();
        int[] array = new int[size]; 
        
        for (int i = 0; i < size; i ++) {       //заполнение массива рандомными числами
            array[i] = rand.nextInt(0, 100);
        }
        System.out.print("Массив до сортировки: "); //вывод массива на экран
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.print("\nМассив после сортировки: "); //вывод массива на экран
        SortMerge(array, size);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void merge(       //метод слияния готового массива
        int[] arr_merge, int[] l_side, int[] r_side, int left, int right) {
        int index_l = 0, index_r = 0, index_m = 0;
    while (index_l < left && index_r < right) {
        if (l_side[index_l] <= r_side[index_r]) {
            arr_merge[index_m++] = l_side[index_l++];
        }
        else {
            arr_merge[index_m++] = r_side[index_r++];
        }
    }
    while (index_l < left) {
        arr_merge[index_m++] = l_side[index_l++];
    }
    while (index_r < right) {
        arr_merge[index_m++] = r_side[index_r++];
    }
}
    public static void SortMerge(int[] arr, int size) {   //метод сортировки массива слиянием
        if (size < 2) {
            return;
        }
        int mid = size / 2;
        int[] left_side = new int[mid];
        int[] right_side = new int[size - mid];
    
        for (int i = 0; i < mid; i++) {
            left_side[i] = arr[i];
        }
        for (int i = mid; i < size; i++) {
            right_side[i - mid] = arr[i];
        }
        SortMerge(left_side, mid);
        SortMerge(right_side, size - mid);
    
        merge(arr, left_side, right_side, mid, size - mid);
    }
}