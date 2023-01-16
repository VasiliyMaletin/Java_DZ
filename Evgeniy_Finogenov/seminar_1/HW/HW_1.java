// Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
// Пункты реализовать в методе main
// *Пункты реализовать в разных методах
import java.util.ArrayList;
import java.util.Random;

public class HW_1 {
    public static void main(String[] args) {
        int i, n;
        i = Random();
        System.out.printf("Рандомное число: %s\n", i);
        n = MSB(i);
        System.out.printf("Номер старшего значащего бита: %s\n", n);
        ArrayList<Integer> m1 = new ArrayList<Integer>(Multiples(i, n));
        System.out.printf("Кратные числа от i до Short.MAX_VALUE: %s", m1);
        ArrayList<Integer> m2 = new ArrayList<Integer>(NotMultiples(i, n));
        System.out.printf("Не кратные числа от Short.MIN_VALUE до i: %s", m2);
    }

    private static int Random() {
        int result;
        Random rd = new Random();
        result = rd.nextInt(0, 2001);
        return result;
    }

    private static int MSB(int number)
    {
        int msb = (int)(Math.log(number) / Math.log(2));
        return 1 << msb;
    }

    private static ArrayList<Integer> Multiples(int i, int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int multNum = i;
        arr.add(multNum);
        while (multNum <= Short.MAX_VALUE) {
            if (multNum % n == 0) {
                multNum += n;
                if (multNum > Short.MAX_VALUE) {
                    break;
                }
                arr.add(multNum);
            } else {
                multNum++;
            }
        }
        return arr;
    }

    private static ArrayList<Integer> NotMultiples(int i, int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int notMultNum = i;
        arr.add(notMultNum);
        while (Short.MIN_VALUE <= notMultNum) {
            if (notMultNum % n != 0) {
                arr.add(notMultNum);
                notMultNum--;
            } else {
                notMultNum--;
            }
        }
        return arr;
    }
}
