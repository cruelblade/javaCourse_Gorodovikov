import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        client.pay(100); //дефолтный метод абстрактного класса Person
        client.pay(); //переопределенный метод абстрактного класса Person
        client.print("Игорь");
        System.out.println();

        Employee employee = new Employee();
        employee.pay(); //переопределенный метод абстрактного класса Person
        client.print("Владимир");
        System.out.println();


        SeasonHandler.whichSeason(Season.Winter.getSeasonName(), Season.Winter.getSeasonColor()); //Реализация SeasonHandler + enum
    }

}
