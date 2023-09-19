package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Создаем HashMap для хранения ассоциативных данных
        Map<String, Integer> ageMap = new HashMap<>();

        // Добавляем пары ключ-значение в карту
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 35);

        // Получаем значение по ключу
        int aliceAge = ageMap.get("Alice");
        System.out.println("Alice's age: " + aliceAge);

        // Проверяем наличие ключа в карте
        boolean hasKey = ageMap.containsKey("David");
        System.out.println("Contains key 'David': " + hasKey);

        // Итерируемся по парам ключ-значение
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();
            System.out.println(name + " is " + age + " years old.");
        }
    }
}
