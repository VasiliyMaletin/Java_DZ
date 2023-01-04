// Реализовать простой калькулятор
package DZ;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int first_number = iScanner.nextInt();
        System.out.println("Введите операцию:");
        char operation = iScanner.next().charAt(0);
        System.out.println("Введите второе число:");
        int second_number = iScanner.nextInt();
        
        int result = 0;
        switch(operation) {
            case '+':
                result = first_number + second_number;
                break;
            case '-':
                result = first_number - second_number;
                break;
            case '*':
                result = first_number * second_number;
                break;
            case '/':
                if (second_number == 0) {
                    System.out.println("На ноль делить нельзя!");
                }
                else {
                result = first_number / second_number;
                }
                break;
            default:
                System.out.println("Такой операции нет");
        }
        System.out.printf("Результат = %s", result);
        iScanner.close();
    }
}
