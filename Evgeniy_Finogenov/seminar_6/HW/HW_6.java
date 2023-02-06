package HW;

import java.util.HashMap;
import java.util.Iterator;

public class HW_6 {

    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object OBJECT = new Object();
    public static void main(String[] args) throws Exception {
        add(123);
        add(8);
        add(37);
        add(8);
        add(43);
        System.out.println(getString());
        System.out.println(isEmpty());

        try { 
            System.out.println(gettKey(4));  
        } catch (Exception e) {
            System.out.println("Ошибка введённого индекса");
        }

        Iterator<Integer> iterator = hMap.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    private static int gettKey(int num) {
        return (Integer) hMap.keySet().toArray()[num];
    }

    private static boolean isEmpty() {
        return hMap.isEmpty();
    }

    private static String getString() {
        return hMap.keySet().toString();
    }

    public static void add(Integer numbers) {
        hMap.put(numbers, OBJECT);
    }
}
