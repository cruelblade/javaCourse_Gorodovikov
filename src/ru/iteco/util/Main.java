package ru.iteco.util;

public class Main {

    public static void main(String[] args) {

        //Конструктор с аргументом
        Arya arya = new Arya("Nymeria");
        //Конструктор без аргумента с экземпляром родительского класса
        Ned robb = new Robb();

        //Проверка вывода присвоенного значения аргумента
        System.out.println("Arya's wolf is " + arya.wolf);

        //Проверка set для private переменной needle
        arya.setNeedle("Needle");
        //Вызов override метода cut с значением из set
        arya.cut();

        //Проверка get из private переменной surname родительского класса
        System.out.println("Robb is " + robb.getSurname());

        //Конвертация экземпляра класса для получения прямого доступа к переменной executor
        Robb kingOfTheNorth = (Robb) robb;
        //Вызов метода die родительского класса
        robb.die(kingOfTheNorth.executor);
    }
}
