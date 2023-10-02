package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        /**
         * Количество имён с символами больше 4
         */

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        long count = names.stream()
                .filter(name -> name.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .count();


        /**
         * filter(Predicate<T> predicate): Фильтрация элементов по заданному условию (предикату).
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        // evenNumbers содержит [2, 4, 6]


        /**
         * map(Function<T, R> mapper): Преобразование каждого элемента в другой объект.
         */
        List<String> names1 = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> nameLengths = names1.stream()
                .map(String::length)
                .collect(Collectors.toList());
        // nameLengths содержит [5, 3, 7]


        /**
         * flatMap(Function<T, Stream<R>> mapper): Преобразование элементов в потоки,
         * а затем объединение этих потоков в один поток.
         */

        List<List<Integer>> nestedLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
        List<Integer> flattenedList = nestedLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        // flattenedList содержит [1, 2, 3, 4]


        /**
         * distinct(): Удаление дубликатов из потока.
         */
        List<Integer> numbers1 = Arrays.asList(1, 2, 2, 3, 3, 4);
        List<Integer> distinctNumbers = numbers1.stream()
                .distinct()
                .collect(Collectors.toList());
        // distinctNumbers содержит [1, 2, 3, 4]


        /**
         * sorted(): Сортировка элементов в потоке.
         */
        List<Integer> numbers2 = Arrays.asList(3, 1, 4, 2, 5);
        List<Integer> sortedNumbers = numbers2.stream()
                .sorted()
                .collect(Collectors.toList());
        // sortedNumbers содержит [1, 2, 3, 4, 5]

        /**
         * forEach(Consumer<T> action): Выполнение действия для каждого элемента в потоке.
         */
        List<String> names2 = Arrays.asList("Alice", "Bob", "Charlie");
        names2.stream()
                .forEach(name -> System.out.println("Hello, " + name));
        // Вывод:
        // Hello, Alice
        // Hello, Bob
        // Hello, Charlie


        /**
         * reduce(BinaryOperator<T> accumulator): Уменьшение (агрегирование) элементов в потоке
         * до одного значения с использованием указанного бинарного оператора.
         */

        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers3.stream()
                .reduce((a, b) -> a + b)
                .orElse(0);
        // sum содержит 15


        /**
         * collect(Collector<T, A, R> collector): Сбор элементов потока в коллекцию или другую структуру данных.
         */
        List<String> names3 = Arrays.asList("Alice", "Bob", "Charlie");
        Set<String> nameSet = names3.stream()
                .collect(Collectors.toSet());
        // nameSet содержит {"Alice", "Bob", "Charlie"}


        /**
         * limit(long maxSize): Ограничение по количеству элементов
         */
        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> limitedNumbers = numbers4.stream()
                // Ограничиваем только первыми 5 элементами
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(limitedNumbers);
        // Выведет [1, 2, 3, 4, 5]


        /**
         *  flatMap(): Объединение в один поток
         */
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        List<Integer> flatList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flatList);
        // Выведет [1, 2, 3, 4, 5, 6, 7, 8]


    }
}
