// Пусть дан список сотрудников: Иван Иванов ( и остальные, полный текст дз будет на платформе)
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.
package Seminars.seminar_5.DZ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<String> staff = new ArrayList<String>(Arrays.asList("Иван", "Виктория", "Елена",
         "Виктор", "Николай", "Ольга", "Василий", "Валентина", "Станислав"));
        ArrayList<String> staffList = new ArrayList<String>(10);
        for (int i = 0; i < 10; i++) {
            staffList.add(staff.get(new Random().nextInt(9)));
        }
        System.out.println(staffList);
        HashMap<String, Integer> staffMap = new HashMap<String, Integer>();
        for (String employee : staffList) {
            if (staffMap.get(employee) == null) {
                staffMap.put(employee, 1);
            }
            else {
                staffMap.put(employee, staffMap.get(employee) + 1);
            }
        }
        HashMap<String, Integer> staffSorted = staffMap.entrySet().stream()
        .sorted(Comparator.comparingInt(e -> -e.getValue()))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (a, b) -> {
                    throw new AssertionError();
                }, LinkedHashMap::new));
        System.out.println(staffSorted);
    }
}
