import java.util.ArrayList;
import java.util.List;

public class Apartments {
    String name;
    String address;
    String metroStation;
    int roomCount;
    int footage;
    int price;
    int averageRating;
    static List<Apartments> apartmentsList = new ArrayList<>();

    public Apartments(String name, String address, String metroStation, int roomCount, int footage, int price, int averageRating) {
        this.name = name;
        this.address = address;
        this.metroStation = metroStation;
        this.roomCount = roomCount;
        this.footage = footage;
        this.price = price;
        this.averageRating = averageRating;
    }

    public static void addApartment() {
        System.out.println("Введите название квартиры");
        String name = Helpers.isNotEmpty(Helpers.scanner.nextLine());

        System.out.println("Введите адрес");
        String address = Helpers.isNotEmpty(Helpers.scanner.nextLine());

        System.out.println("Введите станцию метро");
        String metroStation = Helpers.isNotEmpty(Helpers.scanner.nextLine());

        System.out.println("Введите количество комнат");
        int roomCount = Helpers.toNumeric(Helpers.isNotEmpty(Helpers.scanner.nextLine()));

        System.out.println("Введите метраж");
        int footage = Helpers.toNumeric(Helpers.isNotEmpty(Helpers.scanner.nextLine()));

        System.out.println("Введите цену");
        int price = Helpers.toNumeric(Helpers.isNotEmpty(Helpers.scanner.nextLine()));

        System.out.println("Введите среднюю оценку");
        int averageRating = Helpers.toNumeric(Helpers.isNotEmpty(Helpers.scanner.nextLine()));

        apartmentsList.add(new Apartments(
                name,
                address,
                metroStation,
                roomCount,
                footage,
                price,
                averageRating));

        System.out.println("Апартаменты добавлены\n");
        MenuActions.apartmentsMenuActions();
    }
}
