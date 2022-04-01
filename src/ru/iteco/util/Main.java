package ru.iteco.util;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Задача 1

        int [][] array = new int[4][3];
        int [] sum = new int[4];

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                Scanner in = new Scanner(System.in);
                while (true) {
                    try {
                        array[i][j] = in.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("На ввод принимаются только числа в диапазоне Integer");
                        in.nextLine();
                    }
                }
                sum[i] += array[i][j];
                if (j == array[i].length - 1)
                {
                    System.out.printf("\nLine %d: %d\n\n", i + 1, sum[i]);
                }
            }
        }
        System.out.println();

        //Задача 2
        int [][] array2 = new int[4][3];
        int [] sum2 = new int[3];
        Scanner in2 = new Scanner(System.in);
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = in2.nextInt();
                sum2[j] += array2[i][j];
            }
        }
        for (int k = 0; k < sum2.length; k++) {
            System.out.println(sum2[k]);
        }
        System.out.println();

        //Задача 3
        int [][] array3 = new int[4][3];
        Scanner in3 = new Scanner(System.in);
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = in3.nextInt();;
                if (array3[i][j] % 2 != 0) {
                    array3[i][j] = 1;
                } else {
                    array3[i][j] = 0;
                }
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Задача 4
        int [][] array4 = new int[4][3];
        double [] sum4 = new double[4];
        Scanner in4 = new Scanner(System.in);
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                array4[i][j] = in4.nextInt();
                sum4[i] += array4[i][j];
                if (j == array4[i].length - 1) {
                    System.out.printf("\nLine %d: %.3f\n\n", i + 1, sum4[i]/array4[i].length);
                }
            }
        }

        //Задача 5
        int line = 4;
        int column = 3;
        int [][] array5 = new int[line][column];
        int [] reverseArray = new int[line * column];
        int k = 0;
        Scanner in5 = new Scanner(System.in);
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                array5[i][j] = in5.nextInt();
                reverseArray[reverseArray.length - 1 - k] = array5[i][j];
                k++;
            }
        }
        for (int i = 0; i < reverseArray.length; i++) {
            System.out.println(reverseArray[i]);
        }





    }
}
