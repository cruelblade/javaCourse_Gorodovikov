import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();

        //дефолтный метод абстрактного класса Person
        client.pay(100);

        //переопределенный метод абстрактного класса Person
        client.pay();

        //переопределенный метод из интерфейса Printable
        client.print("Игорь");

        //вывод переменной из абстрактного класса Person через дочерний класс Client
        System.out.println(client.getStr());
        System.out.println();

        Employee employee = new Employee();

        //переопределенный метод абстрактного класса Person
        employee.pay();

        //переопределенный метод из интерфейса Printable
        client.print("Владимир");
        System.out.println();

        //реализация SeasonHandler + enum
        SeasonHandler.whichSeason(Season.Winter.getSeasonName(), Season.Winter.getSeasonColor());
    }

}
