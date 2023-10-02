package GreenAtomTrainee.Lesson2;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.*;

public class ExceptionArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> arrayList = new ArrayList<>();

        System.out.println("Введите значения (для завершения введите 'exit'):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                if (arrayList.size() >= 5) {
                    throw new ExceptionArray();
                }
                arrayList.add(input);
            } catch (ExceptionArray e) {
                e.printStackTrace();
            }
        }
    }
}

class ExceptionArray extends Exception {
    @Override
    public String getLocalizedMessage() {
        return "Переполнение коллекции: не более 5 элементов (для выхода нажмите exit)";
    }

    @Override
    public void printStackTrace() {
        System.out.println("Переопределенный стэк трейс: ");
        printStackTrace(System.err);
    }
}

