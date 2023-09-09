package main.java.bigletters;

import java.util.Scanner;

public class ConsoleUtils {

    public static int readInt(Scanner scanner, String message) {
        System.out.println(message);
        int value = scanner.nextInt();

        if (value < 1) {
            throw new IllegalArgumentException("Value can't be less than 1");
        }

        return value;
    }

    public static String readString(Scanner scanner, String message) {
        System.out.println(message);
        return scanner.next();
    }

    public static String[] readMultipleStrings(Scanner scanner, String message, int height) {
        System.out.println(message);

        String[] rawInput = new String[height];
        scanner.nextLine();

        for (int i = 0; i < height; i++) {
            rawInput[i] = scanner.nextLine();
        }

        return rawInput;
    }
}
