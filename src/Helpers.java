import java.util.Scanner;

public interface Helpers {
    Scanner scanner = new Scanner(System.in);

    static String isNotEmpty(String str) {
        while (str.replaceAll("[^А-я\\w\\d]|\\s", "").equals("")) {
            System.out.println("Нельзя вводить пустые значения");
            str = scanner.nextLine();
        }
        return str;
    }

    static int toNumeric(String str) {
        int numeric = 0;
        try {
            numeric = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("Значение должно быть числовым");
            str = scanner.nextLine();
            toNumeric(str);
        }
        return numeric;
    }

    static void addedApartments() {
        Apartments.apartmentsList.add(new Apartments(
                "Квартира",
                "Войковская",
                "Летниковская, 24",
                3,
                63,
                90000300,
                40000000));
        Apartments.apartmentsList.add(new Apartments(
                "Квартира",
                "Беговая",
                "Туристская, 24",
                4,
                43,
                63004000,
                111000000));
        Apartments.apartmentsList.add(new Apartments(
                "Квартира",
                "Печатники",
                "Краснодарская, 28",
                1,
                42,
                7004800,
                12000000));
    }


}
