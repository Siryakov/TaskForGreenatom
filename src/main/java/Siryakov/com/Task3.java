package Siryakov.com;

import java.util.LinkedList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>(List.of("этот", "список", "будет", "инвертирован", "с", "использованием", "второго", "списка"));
        System.out.println("Исходный список:");
        System.out.println(linkedList);

        System.out.println("Инвертированный список с помощью второго списка:");
        System.out.println(invertLinkedList1(linkedList));

        LinkedList<String> linkedList2 = new LinkedList<>(List.of("этот", "список", "будет", "инвертирован", "без", "использования", "второго", "списка"));
        System.out.println("\nИсходный список:");
        System.out.println(linkedList2);

        invertLinkedList2(linkedList2);
        System.out.println("Инвертированный список методом чередующихся элементов:");
        System.out.println(linkedList2);
    }

    public static LinkedList<String> invertLinkedList1(LinkedList<String> list) {
        LinkedList<String> reversedList = new LinkedList<>();

        while (!list.isEmpty()) {
            reversedList.addFirst(list.removeFirst());
        }
        return reversedList;
    }

    public static LinkedList<String> invertLinkedList2(LinkedList<String> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            String temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
        return list;
    }
}
