// Пусть дан произвольный список целых чисел, удалить из него четные числа
package Seminars.seminar_3.DZ;

import java.util.ArrayList;
import java.util.Random;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> listNumbers = new ArrayList<Integer>(20);
        Random rd = new Random();
        for (int i = 0; i < 20; i++) {
            listNumbers.add(rd.nextInt(1, 100));
        }
        System.out.println(listNumbers);
        listNumbers.removeIf(i -> (i % 2 == 0));
        System.out.println(listNumbers);
    }
}
