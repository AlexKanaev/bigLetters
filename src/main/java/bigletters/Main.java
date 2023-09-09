package main.java.bigletters;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int option = -1;
            while (option != 0) {
                Menu.showOptions();
                try {
                    option = scanner.nextInt();
                    if (option < 0 || option > 6) {
                        throw new InputMismatchException();
                    }
                    Menu.doAction(option, scanner);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    option = -1;
                    System.out.println("Incorrect input");
                    scanner.nextLine();
                }
            }
        }
    }
}
