// Вывести все простые числа от 1 до 1000
package DZ;

public class task_2 {
    public static void main(String[] args) {
        int number = 1000;
        for (int i = 2; i <= number; i++) {
            Integer result = i;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    result = null;
                    break;
                }
            }
            if (result != null) {
            System.out.println(result);
            }  
        }
    }
}
