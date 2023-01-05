// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
package Seminars.seminar_2.DZ;

import java.util.Arrays;
import java.util.logging.Logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

public class task_2 {
    public static void main(String[] args) {
        int[] array = { 9, 4, 8, 3, 6, 7, 2, 5 };
        int temp = 0;
        String msg = "";
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            msg = String.format("Find max %d", temp);
            logs(msg);
            msg = String.format("Change %d with %d", array[i], array[array.length - i - 1]);
            logs(msg);
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    public static void logs(String msg) {
        Logger logger = Logger.getLogger(task_2.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler fh = new ConsoleHandler();
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.log(Level.INFO, msg);
    }
}
