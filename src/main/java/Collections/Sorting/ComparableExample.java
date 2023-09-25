package Collections.Sorting;

public class ComparableExample implements Comparable<ComparableExample> {

    private String name;
    private int age;

    // Конструкторы, геттеры, сеттеры и другие методы

    @Override
    public int compareTo(ComparableExample other) {
        // Реализация сравнения, например, по возрасту
        return Integer.compare(this.age, other.age);
    }
}


