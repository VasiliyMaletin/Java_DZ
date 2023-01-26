// Напишите программу, 
// чтобы найти вхождение в строке (содержащей все символы другой строки).
// Напишите программу, чтобы проверить, 
// являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
// Дано два числа, например 3 и 56, необходимо составить следующие строки: 
// 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
// Замените символ “=” на слово “равно”. 
// Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
package seminar_2.HW;

public class HW_2 {
    public static void main(String[] args) {
        String str1 = "Hello Otto";
        String str2 = "Otto";
        entry(str1, str2);
        entry(str1, new StringBuilder(str2).reverse().toString());

        int num1 = 3;
        int num2 = 56;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n%d + %d = %d\n", num1, num2, num1 + num2));
        sb.append(String.format("%d - %d = %d\n", num1, num2, num1 - num2));
        sb.append(String.format("%d * %d = %d", num1, num2, num1 * num2));
        System.out.println(sb.toString());
        for (int i = 0; i < sb.length(); i++) {
            if (sb.indexOf("=") == i) {
                sb.deleteCharAt(i);
                sb.insert(i, "равно");
            }
        }
        System.out.println(sb.toString());
        System.out.println(sb.toString().replaceAll("равно", "="));
    }

    public static void entry(String str1, String str2) {
        System.out.println(str1.contains(str2)); 
    }

}
