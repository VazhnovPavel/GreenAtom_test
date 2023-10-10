package GreenAtomTrainee.Lesson3.Task3;

import lombok.Getter;

public class CommandInput {
    @Getter
    String path;
    @Getter
    String fileName;
    @Getter
    String command;
    @Getter
    String content;

    public CommandInput(String path, String fileName, String command, String content) {
        this.path = path;
        this.fileName = fileName;
        this.command = command;
        this.content = content;
    }
    public CommandInput() {

    }
}

