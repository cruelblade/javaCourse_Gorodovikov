package ru.iteco.util;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printSum(in.next(), in.next());
    }

    // выводит сообщение с именем и суммой цифр
    public static void printSum(String name, String num)
    {
        String[] nums = num.split("");
        int[] numsInt = converter(nums);
        int sum = 0;
        int coefficient = 0;
        System.out.printf("Здравствуй %s! Сумма цифр в числе = %s", name, converter(sumRecursion(numsInt, coefficient, sum)));
    }

    // суммирует цифры массива c использованием рекурсии
    public static int sumRecursion(int array[], int coefficient, int sumArray)
    {
        if (coefficient == array.length) {
            return sumArray;
        }
        sumArray += array[coefficient];
        coefficient++;
        return sumRecursion(array, coefficient, sumArray);
    }

    // конвертер числа в строку
    public static String converter(int num)
    {
        return Integer.toString(num);
    }

    // конвертер строкового массива в числовой
    public static int[] converter(String str[])
    {
        int[] arrayInt = new int[str.length];
        for (int i = 0; i < str.length; i++)
        {
            arrayInt[i] = Integer.parseInt(str[i]);
        }
        return arrayInt;
    }

}
