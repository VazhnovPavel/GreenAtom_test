package GreenAtomTrainee.Lesson3.Task3;

import java.util.Arrays;

public class SplitCommand {

    public static CommandInput split(String input) {
        String[] parts = input.split(" ", 2);

        if (parts.length >= 2) {
            String fullPath = parts[0].trim();
            String commandAndContent = parts[1].trim();

            int lastSlashIndex = fullPath.lastIndexOf("/");
            if (lastSlashIndex >= 0) {
                String path = fullPath.substring(0, lastSlashIndex + 1); // Включаем последний символ "/"
                String fileNameWithExtension = fullPath.substring(lastSlashIndex + 1);

                String[] fileNameParts = fileNameWithExtension.split("\\.");
                if (fileNameParts.length >= 2) {
                    String fileName = fileNameWithExtension;

                    String[] commandAndContentParts = commandAndContent.split(" ", 2);
                    String command = commandAndContentParts[0].trim();

                    String content = "";
                    if (commandAndContentParts.length > 1) {
                        content = commandAndContentParts[1].trim();
                    }

                    System.out.println("path =" + path);
                    System.out.println("fileName =" + fileName);
                    System.out.println("command =" + command);
                    System.out.println("content =" + content);
                    return new CommandInput(path, fileName, command, content);
                }
            }
        }
        return null;
    }

}








