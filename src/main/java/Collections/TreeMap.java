package Collections;

import java.util.Map;

public class TreeMap {

    public static void main(String[] args) {
        // Создаем TreeMap для хранения ассоциативного массива товаров
        java.util.TreeMap<String, Integer> inventory = new java.util.TreeMap<>();

        // Добавляем товары в инвентарь
        inventory.put("Яблоки", 50);
        inventory.put("Бананы", 30);
        inventory.put("Апельсины", 40);
        inventory.put("Груши", 25);
        inventory.put("Мандарины", 35);

        // Выводим инвентарь в алфавитном порядке
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(product + ": " + quantity);
        }

        // Изменяем количество яблок в инвентаре
        inventory.put("Яблоки", 60);

        // Выводим обновленный инвентарь
        System.out.println("\nОбновленный инвентарь:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(product + ": " + quantity);
        }

        // Удаляем груши из инвентаря
        inventory.remove("Груши");

        // Выводим финальный инвентарь
        System.out.println("\nИнвентарь после удаления:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(product + ": " + quantity);
        }
    }
}
