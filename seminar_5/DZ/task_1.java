// Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
// что 1 человек может иметь несколько телефонов.
package Seminars.seminar_5.DZ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class task_1 {
    private static Scanner iScanner = null;
    public static void main(String[] args) {
        iScanner = new Scanner(System.in);
        HashMap<String, List<String>> phoneBook = new HashMap<>();
        phoneBook.put("Mariya", List.of("89025848833", "89503432445"));
        phoneBook.put("Dmitriy", List.of("89450344539"));
        phoneBook.put("Nikolay", List.of("89450384239","89542357899"));
        phoneBook.put("Irina", List.of("89681574598", "89451236548", "89421596574"));
        phoneBook.put("Elena", List.of("89454567891"));
        phoneBook.put("Vasiliy", List.of("89321234587", "89523246879", "89123456872"));
        menu(phoneBook);
        iScanner.close();
    }

    public static Map<String, List<String>> menu(Map<String, List<String>> phoneBook) {
        System.out.println(
        "Введите команду из списка:\n all - показать всю телефонную книгу\n search - найти контакт\n"
        + " add - добавить контакт\n exit - выйти");
        while (true) {
            String comands = iScanner.nextLine();
            if (comands.equals("exit")) {
                break;
            } 
            else {
                switch (comands) {
                    case "search":
                        search(phoneBook);
                        break;
                    case "add":
                        add(phoneBook);
                        break;
                    case "all":
                        all(phoneBook);
                        break;
                    default:
                        break;
                }
            }
        }
        return phoneBook;
    }

    public static void search(Map<String, List<String>> phoneBook) {
        System.out.println("Введите имя: ");
        String name = iScanner.nextLine();
        System.out.println(phoneBook.get(name));
        System.out.println();
        menu(phoneBook);
    }

    public static void all(Map<String, List<String>> phoneBook) {
        System.out.println(phoneBook);
        System.out.println();
        menu(phoneBook);
    }

    public static Map<String, List<String>> add(Map<String, List<String>> phoneBook) {
        System.out.println("Если хотите завершить и вернуться назад, введите 'stop'");
        System.out.println("Введите имя: ");
        String name = iScanner.nextLine();
        List<String> number = new ArrayList<>();
        while (true) {
            System.out.println("Введите номер: ");
            String phone = iScanner.nextLine();
            if (phone.equals("stop")) {
                break;
            }
            else {
                number.add(phone);
            }
        }
        phoneBook.put(name, number);
        System.out.println();
        menu(phoneBook);
        return phoneBook;
    }
}