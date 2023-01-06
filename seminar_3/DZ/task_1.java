// Реализовать алгоритм сортировки слиянием
package Seminars.seminar_3.DZ;

import java.util.Arrays;

public class task_1 {
    public static void main(String args[]) {
        int[] arr = {12, 6, 4, 34, 1, 15, 10, 3, 2};
        int[] result = mergeSort(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeSort(int[] arr) {
        int[] temp1 = Arrays.copyOf(arr, arr.length);
        int[] temp2 = new int[arr.length];
        int[] result = mergeSortInner(temp1, temp2, 0, arr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] temp1, int[] temp2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return temp1;
        }

        int mid = startIndex + (endIndex - startIndex) / 2;
        int[] leftArr = mergeSortInner(temp1, temp2, startIndex, mid);
        int[] rightArr = mergeSortInner(temp1, temp2, mid, endIndex);

        int index1 = startIndex;
        int index2 = mid;
        int destIndex = startIndex;
        int[] result = leftArr == temp1 ? temp2 : temp1;
        while (index1 < mid && index2 < endIndex) {
            result[destIndex++] = leftArr[index1] < rightArr[index2]
                    ? leftArr[index1++] : rightArr[index2++];
        }
        while (index1 < mid) {
            result[destIndex++] = leftArr[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = rightArr[index2++];
        }
        return result;
    }
}