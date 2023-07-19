package java_projects;

import java.util.Arrays;

public class j_heapsort {
    public static void heapSort(int[] array) {
        int n = array.length;

        // Построение max-кучи
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        // Извлечение элементов из кучи по одному и перестройка кучи
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Перестройка кучи для уменьшенного массива
            heapify(array, i, 0);
        }
}

private static void heapify(int[] array, int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int leftChild = 2 * i + 1; // Левый потомок узла i
        int rightChild = 2 * i + 2; // Правый потомок узла i

        // Если левый потомок больше корня
        if (leftChild < n && array[leftChild] > array[largest])
            largest = leftChild;

        // Если правый потомок больше, чем наибольший элемент на данный момент
        if (rightChild < n && array[rightChild] > array[largest])
            largest = rightChild;

        // Если наибольший элемент не корень
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Рекурсивно перестраиваем поддерево
            heapify(array, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        heapSort(arr);

        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
}