// Реализовать алгоритм пирамидальной сортировки (HeapSort).
package Seminars.seminar_5.DZ;

public class task_3 {
    public static void main(String args[]) {
        int arr[] = {11, 4, 8, 5, 21, 6, 7};
        task_3 ob = new task_3();
        System.out.print("Начальный массив: ");
        printArray(arr);
        System.out.print("Отсортированный массив: ");
        ob.sort(arr);
        printArray(arr);
    }

    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
   
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int n, int i) {
        int largest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
