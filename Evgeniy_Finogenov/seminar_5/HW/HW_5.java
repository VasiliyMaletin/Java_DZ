// Создать словарь HashMap. Обобщение <Integer, String>.
// Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"),
// добавить ключь, если не было!)
// Изменить значения сделав пол большой буквой.
// Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
package seminar_5.HW;

import java.util.HashMap;

public class HW_5 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Иванов Иван Иванович 32 м");
        hashMap.put(2, "Иванова Ольга Ивановна 28 ж");
        hashMap.put(3, "Воронина Анна Сергеевна 26 ж");
        hashMap.put(4, "Петров Станислав Николаевич 29 м");
        hashMap.putIfAbsent(5, "Кротов Василий Анатольевич 39 м");

        for (Integer key : hashMap.keySet()) {
            String str = hashMap.get(key);
            int index = str.length() - 1;
            char ch = Character.toUpperCase(str.charAt(index));
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(index, ch);
            str = sb.toString();
            hashMap.put(key, str);
        }
        System.out.println(hashMap.values());

        for (Integer key : hashMap.keySet()) {
            String[] array = hashMap.get(key).split(" ");
            String str = array[0] + " " + array[1].charAt(0) +
                         "." + array[2].charAt(0) + ".";
            System.out.println(str);
        }
    }
}
