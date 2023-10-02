package Lambda;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {


        // Пример 1: Лямбда, складывающая два числа
        BinaryOperator<Integer> add = (x, y) -> x + y;
        int result = add.apply(5, 3); // Результат равен 8

        // Пример 2: Лямбда, проверяющая является ли число четным
        Predicate<Integer> isEven = x -> x % 2 == 0;
        boolean even = isEven.test(10); // Результат равен true

        // Пример 3: Создание потока с использованием лямбда-выражения
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello, world!");
            }
        };


        // Пример 4:  Фильтрация и вывод всех имен, начинающихся с буквы 'A'
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

        // Пример 5: Создание кнопки и добавление слушателя с использованием лямбда-выражения
        JButton button = new JButton("Click Me");
        button.addActionListener(e -> {
            System.out.println("Button clicked!");
        });


    }


    }
