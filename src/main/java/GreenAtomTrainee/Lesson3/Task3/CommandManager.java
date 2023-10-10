package GreenAtomTrainee.Lesson3.Task3;

import java.io.*;

public class CommandManager {
    public void create(String fileName, String path){

        File createFile = new File(path, fileName);
        try {
            if (createFile.createNewFile()) {
                System.out.println("Файл успешно создан.");
            } else {
                System.out.println("Файл с таким именем уже существует.");
            }
        } catch (IOException e) {
            System.err.println("Ошибка при создании файла: " + e.getMessage());
        }
    }
    public void delete(String fileName, String path){

        File deleteFile = new File(path, fileName);

        if (deleteFile.exists()) {
            if (deleteFile.delete()) {
                System.out.println("Файл успешно удален.");
            } else {
                System.out.println("Не удалось удалить файл.");
            }
        } else {
            System.out.println("Файл не существует.");
        }
    }

    public void read(String fileName, String path) {
        File fileToRead = new File(path, fileName);

        if (!fileToRead.exists()) {
            System.out.println("Файл не существует.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileToRead))) {
            String line;
            System.out.println("Содержимое файла:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    public void write(String fileName, String path, String content) {
        File fileToWrite = new File(path, fileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToWrite))) {
            writer.write(content);
            System.out.println("Текст успешно записан в файл.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    public void ls(String path) {
        File directory = new File(path);

        if (directory.exists() && directory.isDirectory()) {
            System.out.println("Директория существует.");
        } else {
            System.out.println("Директория не существует.");
        }
    }
}
