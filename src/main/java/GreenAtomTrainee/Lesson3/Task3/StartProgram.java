package GreenAtomTrainee.Lesson3.Task3;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Scanner;


public class StartProgram {

    public static void start() {
        CommandManager commandManager = new CommandManager();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Введите команду (в формате '/путь/к/файлу/ИмяФайла -команда [контент]'): ");
            input = scanner.nextLine().trim();
            CommandInput commandInput = SplitCommand.split(input);

            if (commandInput != null) {
                String path = commandInput.getPath();

                String fileName = commandInput.getFileName();

                String command = commandInput.getCommand();

                String content = commandInput.getContent();

                switch (command.toLowerCase()) {
                    case "-create":
                        commandManager.create(path, fileName);
                        break;

                    case "-delete":
                        commandManager.delete(path, fileName);
                        break;

                    case "-read":
                        commandManager.read(path, fileName);
                        break;

                    case "-write":
                        commandManager.write(path, fileName, content);
                        break;

                    case "-ls":

                        commandManager.ls(path);
                        break;

                    case "exit":
                        System.out.println("Программа завершена.");
                        scanner.close();
                        return;



                    default:
                        System.out.println("Неверная команда. Допустимые команды: create, delete, read, write, exit.");
                        break;
                }
            } else {
                System.out.println("Неверный формат команды. Используйте формат '/путь/к/файлу/ИмяФайла -команда [контент]'.");
            }
        }
    }





}
