// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
package Seminars.seminar_4.DZ;

import java.util.LinkedList;

public class task_2 {
    public static void main(String[] args) {
        LinkedList<Object> startList = new LinkedList<Object>();
        startList.add("first");
        startList.add(8);
        startList.add(5);
        startList.add(7);
        startList.add(1);
        startList.add(3);
        startList.add("last");
        System.out.println(startList);
        enqueue(startList, "to end");
        System.out.println(startList);
        dequeue(startList);
        System.out.println(startList);
        first(startList);
        System.out.println(startList);
    }

    public static LinkedList<Object> enqueue(LinkedList<Object> startList, Object elem) {
        startList.addLast(elem);
        return startList;
    }

    public static LinkedList<Object> dequeue(LinkedList<Object> startList) {
        System.out.println(startList.pollFirst());
        return startList;
    }

    public static void first(LinkedList<Object> startList) {
        System.out.println(startList.getFirst());
    }
}
