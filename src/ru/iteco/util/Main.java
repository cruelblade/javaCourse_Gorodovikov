package ru.iteco.util;
import java.util.*;

public class Main {

    public static void main(String[] args) {
// 1 задание
        int [] array = {3, 22, 1, 13, 4, 6, 16, 5};

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 == 0)
            {
                System.out.println(array[i]);
            }
        }
        System.out.println();

// 2 задание
        int [] array2 = {3, 22, 1, 13, 4, 6, 16, 5};

        for (int i = 0; i < array2.length; i++)
        {
            if (array2[i] > 9 & array2[i] < 100)
            {
                System.out.println(array2[i]);
            }
        }
        System.out.println();

//3 задание
        int [] array3 = {3, 22, 1, 13, 4, 6, 16, 5};
        int max = 0;

        for (int i = 0; i < array3.length; i++)
        {
            if (max < array3[i])
            {
                max = array3[i];
            }
        }

        System.out.println(max);
        System.out.println();

//4 задание
        int [] array4 = {3, 22, 1, 13, 4, 6, 16, 5};
        int sum = 0;

        for (int i = 0; i < array4.length; i++)
        {
            sum += array4[i];
        }

        System.out.println(sum);
        System.out.println();


//5 задание
        int [] array5 = {3, 22, 1, 13, 4, 6, 16, 5};
        int [] newArray = new int[array.length];

        for (int i = array5.length; i >= 0; i--)
        {
            for (int j = 0; j < array5.length; j++) {
                newArray[j] = array5[array5.length - 1 - j];
            }
        }

        for (int k = 0; k < newArray.length; k++)
        {
            System.out.println(newArray[k]);
        }
        System.out.println();
    }
}
