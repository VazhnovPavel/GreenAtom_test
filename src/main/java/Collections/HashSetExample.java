package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Создаем HashSet для хранения уникальных строк
        Set<String> set = new HashSet<>();


        // Добавляем элементы в множество
        set.add("apple");
        set.add("banana");
        set.add("cherry");

        // Попытка добавления дубликата "banana"
        set.add("banana"); // Этот элемент будет проигнорирован

        // Выводим элементы множества
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Проверяем, принадлежит ли "apple" множеству
        boolean containsApple = set.contains("apple");
        System.out.println("Contains 'apple': " + containsApple);

        // Удаляем элемент "banana" из множества
        set.remove("banana");

        // Выводим обновленное множество
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
