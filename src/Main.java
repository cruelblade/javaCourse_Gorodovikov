import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        client.pay(100);
        client.pay();
        System.out.println();

        Employee employee = new Employee();
        employee.pay();
        System.out.println();


        SeasonHandler.whichSeason(Season.Winter.getSeasonName(), Season.Winter.getSeasonColor());
    }

}
