package GreenAtomTrainee.Lesson3.Task3;

import lombok.Getter;

public class CommandInput {
    @Getter
    private String path;
    @Getter
    private String fileName;
    @Getter
    private String command;
    @Getter
    private String content;

    public CommandInput(String path, String fileName, String command, String content) {
        this.path = path;
        this.fileName = fileName;
        this.command = command;
        this.content = content;
    }
}

