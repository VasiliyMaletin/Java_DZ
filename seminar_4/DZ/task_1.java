// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.
package Seminars.seminar_4.DZ;

import java.util.Collections;
import java.util.LinkedList;

public class task_1 {
    public static void main(String[] args) {
        LinkedList<Object> startList = new LinkedList<Object>();
        LinkedList<Object> endList = new LinkedList<Object>();
        startList.add("first");
        startList.add(8);
        startList.add(5);
        startList.add(7);
        startList.add(1);
        startList.add(3);
        startList.add("last");
        System.out.println(startList.toString());
        Collections.reverse(startList);
        endList = startList;
        System.out.println(endList);
    }
}
