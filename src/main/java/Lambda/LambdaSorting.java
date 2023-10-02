package Lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaSorting {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Cherry");
        strings.add("Date");

        // Сортировка списка с использованием Stream и лямбда-выражения
        strings = strings.stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .toList();

        // Вывод отсортированного списка
        for (String str : strings) {
            System.out.println(str);
        }

    }
}
