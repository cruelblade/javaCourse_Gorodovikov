package ru.iteco.util;

import java.util.Scanner;

public class MenuOperations {

    Integer result = null;
    Scanner input = new Scanner(System.in);
    MathOperations operation = new MathOperations();

    public void newOperation() {
        System.out.println("Введите пример");

        String stringToParse = input.nextLine();

        String parsedString[] = stringToParse.replace(" ", "").split("\\W");

        int firstNum = 0;
        int secondNum = 0;

        try {
            firstNum = Integer.parseInt(parsedString[0]);
            if (parsedString.length > 1) {
                secondNum = Integer.parseInt(parsedString[1]);
            }
        } catch (Exception e) {
            System.out.println("Пример должен быть в формате: \"1+1\" или \"3!\".");
            return;
        }


        if (stringToParse.contains("!")) {
            result = operation.factorial(firstNum);
            System.out.println("1 = " + result);
        }
        else if (stringToParse.contains("+")) {
            result = operation.addiction(firstNum, secondNum);
        }
        else if (stringToParse.contains("-")) {
            result = operation.subtraction(firstNum, secondNum);
        }
        else if (stringToParse.contains("/")) {
            result = operation.division(firstNum, secondNum);
        }
        else if (stringToParse.contains("*")) {
            result = operation.multiplication(firstNum, secondNum);
        }
        else if (stringToParse.contains("^")) {
            result = operation.exponentation(firstNum, secondNum);
        }
        else if (stringToParse.contains("?")) {
            operation.comparison(firstNum, secondNum);
            result = null;
        }
        else {
            System.out.println("Недопустимый ввод!\nВведите корректное значение.");
        }
    }

    public void continueOperation() {
        printMenuForPreviousResult();
        String operator = input.nextLine();

        try {
            switch (operator) {
                case "1":
                    System.out.println("Введите число");
                    result = operation.addiction(result, Integer.parseInt(input.nextLine()));
                    break;
                case "2":
                    System.out.println("Введите число");
                    result = operation.subtraction(result, Integer.parseInt(input.nextLine()));
                    break;
                case "3":
                    System.out.println("Введите число");
                    result = operation.multiplication(result, Integer.parseInt(input.nextLine()));
                    break;
                case "4":
                    System.out.println("Введите число");
                    result = operation.division(result, Integer.parseInt(input.nextLine()));
                    break;
                case "5":
                    result = operation.factorial(result);
                    System.out.println("1 = " + result);
                    break;
                case "6":
                    System.out.println("Введите степень числа");
                    result = operation.exponentation(result, Integer.parseInt(input.nextLine()));
                    break;
                case "7":
                    System.out.println("Введите число");
                    operation.comparison(result, Integer.parseInt(input.nextLine()));
                    result = null;
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Недопустимый ввод!\nВведите корректное значение.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Недопустимый ввод!\nВведите корректное значение.");
        }
    }

    public void printMenu() {
        System.out.println("1. Ввести пример");
        System.out.println("2. Продолжить работу с предыдущим ответом");
        System.out.println("3. Выход");
    }

    public void printMenuForPreviousResult() {
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Факториал");
        System.out.println("6. Возведение в степень");
        System.out.println("7. Сравнение");
        System.out.println("0. Назад");
    }

}
