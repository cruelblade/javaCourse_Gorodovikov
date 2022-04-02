package ru.iteco.util;

public class MathOperations {

    int result;

    public int addiction(int firstNum, int secondNum) {
        result = firstNum + secondNum;
        System.out.printf("%d + %d = %d", firstNum, secondNum, result);
        return result;
    }

    public int subtraction(int firstNum, int secondNum) {
        result = firstNum - secondNum;
        System.out.printf("%d - %d = %d", firstNum, secondNum, result);
        return result;
    }

    public int multiplication(int firstNum, int secondNum) {
        result = firstNum * secondNum;
        System.out.printf("%d * %d = %d", firstNum, secondNum, result);
        return result;
    }

    public int division(int firstNum, int secondNum) {
        result = firstNum / secondNum;
        System.out.printf("%d / %d = %d", firstNum, secondNum, result);
        return result;
    }

    public int factorial(int firstNum) {
        if (firstNum <= 1)
        {
            return 1;
        }
        System.out.print(firstNum + " * ");
        result = firstNum * factorial(firstNum - 1);
        return result;
    }

    public int exponentation(int firstNum, int secondNum) {
        result = 1;

        if (secondNum == 0) {
            System.out.printf("%d^0", firstNum);
        }

        for (int i = 0; i < secondNum; i++) {
            result *= firstNum;
            System.out.print(firstNum);

            if (i < secondNum - 1) {
                System.out.print(" * ");
            }
        }
        System.out.print(" = " + result);
        return result;
    }

    public void comparison(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            System.out.printf("%s > %s", firstNum, secondNum);
        }
        else if (firstNum == secondNum) {
            System.out.printf("%s = %s", firstNum, secondNum);
        }
        else {
            System.out.printf("%s < %s", firstNum, secondNum);
        }

    }
}
