package GreenAtomTrainee.Lesson3.Task1;

import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Developer {

    public Developer(String name, List<String> languages) {
        this.name = name;
        this.languages = languages;
    }

    public static void main(String[] args) {
        Developer dev1 = new Developer("Наташа", Arrays.asList("Java", "C++"));
        Developer dev2 = new Developer("Эрнест", Arrays.asList("Java", "Python"));
        Developer dev3 = new Developer("Элла", Arrays.asList("С#", "Python", "JavaScript"));
        Developer dev4 = new Developer("Павел", Arrays.asList("С#", "Java"));
        Stream<Developer> developerStream = Stream.of(dev1, dev2, dev3, dev4);

        // Считаем, сколько раз встречается тот или иной язык
        Map<String, Long> languageCountMap = developerStream
                // с помощью flatMap собираем всё в один поток
                .flatMap(dev -> dev.getLanguages().stream())
                // собираем map в формате: (название языка, количество упоминаний)
                .collect(Collectors.groupingBy(
                        language -> language,
                        Collectors.counting()
                ));

        // Собираем уникальные языки программирования
        Set<String> uniqueLanguages = languageCountMap.entrySet().stream()
                // если ЯП упоминается 1 раз, то добавляем в наш Set
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        // У кого есть уникальный язык, тех добавляем
        List<Developer> uniqueDevelopers = Stream.of(dev1, dev2, dev3, dev4)
                // фильтр проходит по всем программистам, и если есть мэтч со списком uniqueLanguages - добавляем
                .filter(dev -> dev.getLanguages().stream().anyMatch(uniqueLanguages::contains))
                .toList();

        System.out.println("Программисты с уникальными языками программирования: ");
        uniqueDevelopers.forEach(dev -> System.out.println(dev.getName()));
    }

    @Getter
    private String name;
    @Getter
    private List<String> languages;
}
