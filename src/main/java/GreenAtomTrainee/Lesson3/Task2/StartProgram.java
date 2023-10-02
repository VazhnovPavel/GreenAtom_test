package GreenAtomTrainee.Lesson3.Task2;

public class StartProgram {
    public static void start() {
        Serialization serialization = new Serialization();
        DeSerialization deSerialization = new DeSerialization();
        PrintObject printObject = new PrintObject();

        Person person = new Person("Павел", 40);
        serialization.addSerialization(person, "person.ser");
        printObject.print(deSerialization.addDeserialization("person.ser",Person.class));

        Person person1 = new Person("Анна", 22);
        serialization.addSerialization(person1, "person1.ser");
        printObject.print(deSerialization.addDeserialization("person1.ser",Person.class));

        Person person2 = new Person("Олег", 12);
        serialization.addSerialization(person2, "person2.ser");
        printObject.print(deSerialization.addDeserialization("person2.ser",Person.class));

        Car car = new Car("Hyundai Solaris",2018);
        serialization.addSerialization(car, "Hyundai Solaris.ser");
        printObject.print(deSerialization.addDeserialization("Hyundai Solaris.ser",Car.class));

    }
}
