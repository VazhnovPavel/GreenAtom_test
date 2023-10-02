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
                String path = fullPath.substring(0, lastSlashIndex); // Убрали последний символ "/"
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





//    public static CommandInput split(String input) {
//        String[] parts = input.split(" ", 2);
//
//        if (parts.length >= 2) {
//            String pathAndCommand = parts[0];
//            String content = parts[1];
//
//            String[] pathAndCommandParts = pathAndCommand.split(" ");
//
//            if (pathAndCommandParts.length >= 2) {
//                String fullPath = pathAndCommandParts[0].trim();
//                String command = pathAndCommandParts[1].trim();
//                String[] fullPathParts = fullPath.split("/");
//
//                if (fullPathParts.length >= 3) { // Должно быть как минимум 3 части (путь, имя файла, расширение)
//                    String path = String.join("/", Arrays.copyOfRange(fullPathParts, 0, fullPathParts.length - 2));
//                    String fileNameWithExtension = fullPathParts[fullPathParts.length - 2] + "/" + fullPathParts[fullPathParts.length - 1];
//
//                    // Разделяем имя файла и расширение
//                    String[] fileNameParts = fileNameWithExtension.split("\\.");
//                    if (fileNameParts.length >= 2) {
//                        String fileName = fileNameParts[0];
//                        String fileExtension = fileNameParts[1];
//                        return new CommandInput(path, fileName, command, content);
//                    }
//                }
//            }
//        }
//        return null;
//    }


}
