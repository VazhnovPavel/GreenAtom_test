package Stream;

import java.util.Arrays;
import java.util.List;

public class TerminalOperationExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Паша", "Настя", "Соня", "Богдан");

        // Создаем стрим из списка и используем терминальный оператор forEach
        names.stream().forEach(name -> System.out.println("Привет, " + name));
    }
}
