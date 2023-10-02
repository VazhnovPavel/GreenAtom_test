package Stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {

    public static void main(String[] args) {

        //Добавляем значения в List
        List<String> stringList = Stream.of("A", "B", "C")
                .collect(Collectors.toList());

        //Добавляем значения в String
        String concatenated = Stream.of("A", "B", "C")
                .collect(Collectors.joining(", "));

        //Добавляем значения в <Map>
        Map<Integer, String> map = Stream.of("A", "B", "C")
                .collect(Collectors.toMap(s -> s.hashCode(), s -> s));



    }

}
