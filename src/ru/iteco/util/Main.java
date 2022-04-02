package ru.iteco.util;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        MenuOperations menuOperation = new MenuOperations();
        Scanner inputMenuItem  = new Scanner(System.in);
        String choosingMenuItem = "1";

        menuOperation.printMenu();

        while (!choosingMenuItem.equals("3")) {
            switch (choosingMenuItem = inputMenuItem.nextLine()) {
                case "1":
                    menuOperation.newOperation();
                    break;
                case "2":
                    if (menuOperation.result != null)
                        menuOperation.continueOperation();
                    else System.out.println("Недоступно!");
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Недопустимый ввод!\nВведите корректное значение.");
                    break;
            }
            System.out.print("\n\n");
            menuOperation.printMenu();
        }

    }

}
