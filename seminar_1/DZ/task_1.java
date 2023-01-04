// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package DZ;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = Integer.parseInt(iScanner.nextLine());
        iScanner.close();
        int result = (number + 1) * number / 2;
        System.out.printf("Результат - %d", result);   
    } 
}