// Задан целочисленный список ArrayList. Найти минимальное,
// максимальное и среднее из этого списка.
package Seminars.seminar_3.DZ;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Random;

public class task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> listNumbers = new ArrayList<Integer>(10);
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            listNumbers.add(rd.nextInt(1, 100));
        }
        System.out.println(listNumbers);
        int min = listNumbers.get(0);
        int max = listNumbers.get(0);
        for (Integer i: listNumbers) {
            if(i < min)
                min = i;
            if(i > max)
                max = i;
        }

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Среднее значение: " + getAverage(listNumbers));
    }

    private static double getAverage(ArrayList<Integer> listNumbers) {
        IntSummaryStatistics stats = listNumbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        return stats.getAverage();
    }
}
