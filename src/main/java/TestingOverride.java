import java.util.Objects;

public class TestingOverride {
    public static void main(String[] args) {
        Person person = new Person("Pavel",28);
        System.out.println(person.toString());
    }
    private String name;
    private int age;

    // Конструкторы, геттеры, сеттеры и другие методы

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.getAge() && Objects.equals(name, person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
