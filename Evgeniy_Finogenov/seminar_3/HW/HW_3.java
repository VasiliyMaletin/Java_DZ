// Объявить два списка список ArrayList, в каждый добавить по 20 случайных чисел.
// Удалить из первого списка элементы отсутствующие во втором списке.
// Отсортировать первый список методом sort класса Collections.
// * Отсортировать второй список методом sort списка и компаратором по уменьшению.
package seminar_3.HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class HW_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        random(list1);
        random(list2);
        System.out.println("----------Рандомные числа----------");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println();
        
        list1.retainAll(list2);
        System.out.println("----------Удаление чисел----------");
        System.out.println(list1);
        System.out.println();

        Collections.sort(list1);
        System.out.println("----------Сортировка через Collections----------");
        System.out.println(list1);
        System.out.println();

        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num2 - num1;
            }
        });
        System.out.println("----------Сортировка через Comparator----------");
        System.out.println(list2);
    }
    
    public static void random(ArrayList<Integer> list) {
        Random rd = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(rd.nextInt(50));
        }
    }
}
