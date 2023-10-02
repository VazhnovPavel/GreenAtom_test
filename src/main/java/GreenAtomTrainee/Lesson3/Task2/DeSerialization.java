package GreenAtomTrainee.Lesson3.Task2;

import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

    public <T> T addDeserialization(String fileName, Class<T> expectedClass) {

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            Object restoredObject = inputStream.readObject();

                if (restoredObject instanceof Person) {
                    Person person = (Person) restoredObject;
                    person.setActivity(person.getAge());
                }
            return expectedClass.cast(restoredObject);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
