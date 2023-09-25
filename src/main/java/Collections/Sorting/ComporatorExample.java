package Collections.Sorting;

import java.util.Comparator;

public class ComporatorExample {
    private String name;
    private int age;


// Конструкторы, геттеры, сеттеры и другие методы

    // Внешний компаратор для сравнения по имени
    public static Comparator<ComporatorExample> nameComparator = Comparator.comparing(ComporatorExample::getName);

    // Внешний компаратор для сравнения по возрасту
    public static Comparator<ComporatorExample> ageComparator = Comparator.comparingInt(ComporatorExample::getAge);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
