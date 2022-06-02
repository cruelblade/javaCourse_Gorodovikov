import java.util.List;
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

    static int inListBound(List<? extends Placements> list, int index) {
        while (index - 1 >= list.size() | index < 1) {
            System.out.println("Введите корректное число");
            index = toNumeric(scanner.nextLine());
        }
        return index - 1;
    }

    static void addedPlacements() {
        Apartments.apartmentsList.add(new Apartments(
                "Квартира",
                "Летниковская, 24",
                "Войковская",
                3,
                63,
                90000300,
                10));
        Apartments.apartmentsList.add(new Apartments(
                "Квартира",
                "Туристская, 24",
                "Беговая",
                4,
                43,
                63004000,
                9));
        Apartments.apartmentsList.add(new Apartments(
                "Квартира",
                "Краснодарская, 28",
                "Печатники",
                1,
                42,
                7004800,
                8));
        Apartments.apartmentsList.add(new Apartments(
                "Квартира",
                "Краснодарская, 28",
                "Печатники",
                1,
                44,
                7004810,
                3));
        CommercialPremises.commercialPremisesList.add(new CommercialPremises(
                "Коммерческое помещение",
                "Васильевская ул., 28",
                "Хамовники",
                "Офис",
                41,
                7004810,
                5
        ));
        CommercialPremises.commercialPremisesList.add(new CommercialPremises(
                "Коммерческое помещение",
                "Васильевская ул., 28",
                "Хамовники",
                "Штаб-квартира",
                142,
                7004810,
                6
        ));
        CommercialPremises.commercialPremisesList.add(new CommercialPremises(
                "Коммерческое помещение",
                "Леманская ул., 28",
                "Зябликово",
                "Склад",
                151,
                7004851,
                4
        ));
    }


}
