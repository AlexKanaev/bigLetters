package bigletters;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    public static String[] options = {"1 -- [Set width]", "2 -- [Set height]", "3 -- [Set text]", "4 -- [Set pattern]",
            "5 -- [Print entered parameters]", "6 -- [Get Result]", "0 -- [Exit]"};

    public static UserPattern userPattern = new UserPattern();
    public static String[] tempArray;

    public static void showOptions() {
        System.out.println("\nPlease choose an action from the list below by pressing the required number on your keyboard.\n");

        for (String item : options) {
            System.out.println(item);
        }
        System.out.println();
    }

    public static void doAction(int option, Scanner scanner) {

        switch (option) {
            case Constants.EXIT_OPTION -> System.out.println("Program shutting down");
            case Constants.WIDTH_OPTION -> userPattern.setWidth(ConsoleUtils.readInt(scanner, "Please type in letter width: "));
            case Constants.HEIGHT_OPTION -> userPattern.setHeight(ConsoleUtils.readInt(scanner, "Please type in letter height: "));
            case Constants.TEXT_OPTION -> userPattern.setText(ConsoleUtils.readString(scanner, "Please type in your text: "));
            case Constants.PATTERN_OPTION -> savePattern(scanner, "Please type in your pattern: ");
            case Constants.PARAMS_OPTION -> userPattern.showPatternParams();
            case Constants.RESULT_OPTION -> getResult(tempArray);
        }

    }

    public static void savePattern(Scanner scanner, String message) {

       if (userPattern.getHeight() < Constants.MIN_HEIGHT) {
           throw new IllegalArgumentException("You have to set valid height first");
       }

       tempArray = ConsoleUtils.readMultipleStrings(scanner, message, userPattern.getHeight());

    }

    public static void getResult(String[] tempArray) {
        if (tempArray == null || !userPattern.areParametersSet()) {
            throw new IllegalArgumentException("You have to enter all parameters first");
        }
        String[][] array = Utils.createLettersArray(tempArray, userPattern.getWidth(), userPattern.getHeight());
        HashMap<String, String[]> map = Utils.createLettersMap(array);
        StringBuilder[] result = Utils.getResultingArray(userPattern.getText().toUpperCase(), map, userPattern.getHeight());
        Utils.showResult(result);
    }

}
