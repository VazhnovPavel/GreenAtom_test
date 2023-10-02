package Lambda;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // С использованием ссылки на метод
        names.forEach(System.out::println);

        // Эквивалентное использование лямбда-выражения
        names.forEach(name -> System.out.println(name));

        // Эквивалентное использование цикла for
        for (String name : names) {
            System.out.println(name);
        }
    }
}
