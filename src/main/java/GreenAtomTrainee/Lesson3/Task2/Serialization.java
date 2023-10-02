package GreenAtomTrainee.Lesson3.Task2;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Serialization {
    String fileName;
    public void addSerialization(Object object, String fileName) {

        // Сериализация объекта в файл
        try (
                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(object);
        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }
}