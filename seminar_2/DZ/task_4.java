package Seminars.seminar_2.DZ;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String msg = "";
        System.out.print("Введите первое число: ");
        int first_number = iScanner.nextInt();
        System.out.print("Введите операцию: ");
        char operation = iScanner.next().charAt(0);
        System.out.print("Введите второе число: ");
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
        msg = String.format("" + first_number + " " + operation + " " + second_number + " = " + result);
        logs(msg); 
        System.out.printf("Результат = %s", result);
        iScanner.close();
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
