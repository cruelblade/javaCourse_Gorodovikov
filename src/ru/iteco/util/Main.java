package ru.iteco.util;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //номер 1
        String city = "Москва";
        int population = 10443;
        short unemploymentPercent = 95;
        System.out.printf("Номер 1\n\tГород - %s, население - %d, процент безработных - %d%%\n",
                city, population, unemploymentPercent);

        //номер 2
        char tribuneSection = 'M';
        short place = 6;
        int cost = 23000;
        System.out.printf("Номер 2\n\tСекция на трибуне - %c, место - %d, стоимость билета - %dр\n",
                tribuneSection, place, cost);

        //номер 3
        String name = "Михаил";
        short age = 25;
        short height = 203;
        System.out.printf("Номер 3\n\tИмя - %s, возраст - %d лет, рост - %dсм\n",
                name, age, height);

        //номер 4
        char carLetter = 'A';
        short carNumber = 0;
        int carWeight = 10000;
        System.out.printf("Номер 4\n\tНомер машины - %c%d%d%d%c%c, вес автомобиля - %dкг\n",
                carLetter, carNumber, carNumber, carNumber, carLetter, carLetter, carWeight);

        //номер 5
        String companyName = "Адвант";
        long yearIncome = 34302390082340L;
        float marketShare= 6.4F;
        System.out.printf("Номер 5\n\tНазвание компании - %s, годовой доход - %d, доля на рынке - %.1f%%\n",
                companyName, yearIncome, marketShare);

        //номер 6
        char rhFactor = 43;
        short bloodType = 3;
        float bloodTypeRate = 33.2F;
        System.out.printf("Номер 6\n\tРезус фактор - \"%c\", группа крови - %d, доля людей с этой группой крови - %.1f%%\n",
                rhFactor, bloodType, bloodTypeRate);

        //номер 7
        String universityName = "МАМИ";
        int studentsNumber = 3342;
        float dropoutRate = 10F;
        System.out.printf("Номер 7\n\tНазвание университета - %s, число студентов - %d, доля отчисленных - %.1f%% \n",
                universityName, studentsNumber, dropoutRate);

        //номер 8
        char cinemaRate = 'R';
        long copies = 2353250;
        short rate = 99;
        System.out.printf("Номер 8\n\tРейтинг фильма - %c, копий продано - %d, рейтинг - %d баллов\n",
                cinemaRate, copies, rate);

        //номер 9
        String brandName = "Adidas";
        long goodsProduced = 5262356234220L;
        float salePercent = 10.34F;
        System.out.printf("Номер 9\n\tНазвание бренда - %s, произведено товара - %d, процент продаж - %.2f%%\n",
                brandName, goodsProduced, salePercent);

        //номер 10
        char productCategory = 'G';
        int barcode = 4363460;
        float buyerPercent = 1.111611F;
        System.out.printf("Номер 10\n\tКатегория товара - %c, штрих код - %d, процент покупателей - %.3f\n",
                productCategory, barcode, buyerPercent);
    }
}
