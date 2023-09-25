package Collections;

import java.util.List;

public class ArrayList {
//    public static void main(String[] args) {
//        // Создаем ArrayList для хранения строк
//        List<String> list = new java.util.ArrayList<>();
//
//        // Добавляем элементы в список
//        list.add("apple");
//        list.add("cherry");
//        list.add("banana");
//        list.add("1banana");
//
//
//        // Получаем элементы по индексу и выводим их
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        // Удаляем элемент "banana" из списка
//        list.remove("banana");
//
//        // Выводим обновленный список
//        for (String fruit : list) {
//            System.out.println(fruit);
//        }
//    }
public static void main(String[] args) {
    // Создаем ArrayList для хранения строк
    List<Integer> list = new java.util.ArrayList<>();

    // Добавляем элементы в список
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);


    // Получаем элементы по индексу и выводим их
    for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));
    }

    // Удаляем элемент "banana" из списка
    list.remove(2);

    // Выводим обновленный список
    for (int fruit : list) {
        System.out.println(fruit);
    }
}
}
