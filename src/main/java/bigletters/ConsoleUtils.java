package bigletters;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleUtils {

    public static int readInt(Scanner scanner, String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    public static int readOption(Scanner scanner) {
        int option = scanner.nextInt();
        if (!Utils.isValidOption(option)) {
            throw new InputMismatchException("Option should be greater or equal to 0 and less than 7");
        }
        return option;
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
