// Сохранить в файл строку и загрузить из файла строку с выводом в консоль
// используя классы FileWriter и FileReader
// Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
// Загруженный и разбитый по строкам текст загрузить в подготовленные списки. Фамилии, имена, отчества, возрас и пол в отдельных списках.
// Отсортировать по возрасту используя дополнительный список индексов.
package seminar_4.HW;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class HW_4 {
    public static void main(String[] args) {
        String str = "";
        try {
            FileWriter writer = new FileWriter("seminar_4/HW/db.sql");
            writer.append("Иванов Иван Иванович 32 М\n");
            writer.append("Иванова Ольга Ивановна 28 Ж\n");
            writer.append("Воронина Анна Сергеевна 26 Ж\n");
            writer.append("Петров Станислав Николаевич 29 М\n");
            writer.append("Кротов Василий Анатольевич 39 М\n");
            writer.flush();
            writer.close();

            FileReader reader = new FileReader("seminar_4/HW/db.sql");
            while (reader.ready()) {
                str += (char)reader.read();
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("----------Считанные строки----------");
        System.out.println(str);

        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> patronymic = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();

        String[] array = str.split("\n");
        for (int i = 0; i < array.length; i++) {
            String[] tmp = array[i].split(" ");
            surname.add(tmp[0]);
            name.add(tmp[1]);
            patronymic.add(tmp[2]);
            age.add(Integer.valueOf(tmp[3]));
            gender.add(tmp[4].equals("Ж") ? true : false);
            index.add(i);
        }
        System.out.println("----------Список Имён и Отчеств----------");
        System.out.println(name);
        System.out.println(patronymic);
        System.out.println();
        
        System.out.println("----------Форматированный вывод----------");
        for (int i = 0; i < index.size(); i++) {
            System.out.printf(surname.get(i) + " ");
            System.out.printf(name.get(i).charAt(0) + ".");
            System.out.printf(patronymic.get(i).charAt(0) + ". ");
            System.out.printf(age.get(i).toString());
            System.out.printf((gender.get(i) ? " M" : " Ж"));
            System.out.println();
        }
        System.out.println();

        ArrayList<Integer> tmp = new ArrayList<>(age);
        Collections.sort(tmp);
        System.out.println("----------Отсортированный список----------");
        for (int i = 0; i < tmp.size(); i++) {
            int j = age.indexOf(tmp.get(i));
            index.set(i, j);
        }

        for (int j = 0; j < index.size(); j++) {
            System.out.print(surname.get(index.get(j)) + " ");
            System.out.print(name.get(index.get(j)) + " ");
            System.out.print(patronymic.get(index.get(j)) + " ");
            System.out.print(age.get(index.get(j)) + " ");
            System.out.println(gender.get(index.get(j)) ? "Ж" : "М");
        } 
    }
}
