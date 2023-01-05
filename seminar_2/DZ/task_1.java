// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, 
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
package Seminars.seminar_2.DZ;

import java.util.LinkedHashMap;
import java.util.Map;

public class task_1 {
    public static void main(String[] args) {
        Map <String, String> map = new LinkedHashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Russia");
        map.put("city", "Moscow");
        map.put("age", null);
        System.out.println("\nSELECT * FROM students WHERE " + getQuery(map) + "\n");
    }

    public static String getQuery(Map < String, String> params) {
        StringBuilder WHERE = new StringBuilder();
        for (Map.Entry <String, String> pair : params.entrySet()) {
            if (pair.getValue() != null) {
                WHERE.append(pair.getKey() + " = " + "'" + pair.getValue() + "'" + " and ");
            }
        }
        WHERE.delete(WHERE.length() - 4, WHERE.length());
        return WHERE.toString();
    } 
}
