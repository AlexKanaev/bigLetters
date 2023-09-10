package bigletters;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int option = Constants.DEFAULT_OPTION;
            while (!Utils.isExitOption(option)) {
                Menu.showOptions();
                try {

                    option = ConsoleUtils.readOption(scanner);
                    Menu.doAction(option, scanner);

                } catch (IllegalArgumentException | InputMismatchException e) {

                    System.out.println(e.getMessage());

                } catch (Exception e) {

                    option = Constants.DEFAULT_OPTION;
                    System.out.println("Exception occurred during program execution");
                    scanner.nextLine();

                }
            }
        }
    }
}
