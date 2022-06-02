import java.util.*;
import java.util.stream.Collectors;

public abstract class Placements {
    String name;
    String address;
    String metroStation;
    String type;
    int roomCount;
    int footage;
    int price;
    int averageRating;
    MenuActions menuActions = new MenuActions();

    public void addPlacement() {
        System.out.println("Введите название");
        name = Helpers.isNotEmpty(Helpers.scanner.nextLine());

        System.out.println("Введите адрес");
        address = Helpers.isNotEmpty(Helpers.scanner.nextLine());

        System.out.println("Введите станцию метро");
        metroStation = Helpers.isNotEmpty(Helpers.scanner.nextLine());

        if (this.getClass().getSimpleName().equals("Apartments")) {
            System.out.println("Введите количество комнат");
            roomCount = Helpers.toNumeric(Helpers.isNotEmpty(Helpers.scanner.nextLine()));
        } else if (this.getClass().getSimpleName().equals("CommercialPremises")) {
            System.out.println("Введите тип");
            type = Helpers.isNotEmpty(Helpers.scanner.nextLine());
        }

        System.out.println("Введите метраж");
        footage = Helpers.toNumeric(Helpers.isNotEmpty(Helpers.scanner.nextLine()));

        System.out.println("Введите цену");
        price = Helpers.toNumeric(Helpers.isNotEmpty(Helpers.scanner.nextLine()));

        System.out.println("Введите среднюю оценку");
        averageRating = Helpers.toNumeric(Helpers.isNotEmpty(Helpers.scanner.nextLine()));
    }


    public void deletePlacement(List<? extends Placements> list) {
        if (list.size() < 1) {
            System.out.println("Список пустой\n");
            menuActions.mainMenuActions();
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ". " + list.get(i).toString());
        }
        System.out.println("Выберите номер объекта для удаления");

        list.remove(Helpers.inListBound(list, Helpers.toNumeric(Helpers.scanner.nextLine())));
        System.out.println("Объект удален\n");
        menuActions.mainMenuActions();
    }

    public void sortByPriceAsc(List<? extends Placements> list) {
        list.stream().sorted(Comparator.comparingInt(o -> o.price)).forEach((placement) -> {
            System.out.println("Название - " + placement.name + ", Цена - " + placement.price + ", Оценка - " + placement.averageRating);
        });
        System.out.println();
        menuActions.mainMenuActions();
    }

    public void sortByPriceDesc(List<? extends Placements> list) {
        list.stream().sorted((o1, o2) -> o2.price - o1.price).forEach((placement) -> {
            System.out.println("Название - " + placement.name + ", Цена - " + placement.price + ", Оценка - " + placement.averageRating);
        });
        System.out.println();
        menuActions.mainMenuActions();
    }

    public void metroGroup(List<? extends Placements> list) {
        Map<String, List<Placements>> map = list.stream().collect(Collectors.groupingBy(o1 -> o1.metroStation));
        map.forEach((metroStation, placements) -> {
            System.out.println(metroStation);
            placements.forEach((placement) -> {
                System.out.println("Название - " + placement.name + ", Цена - " + placement.price + ", Оценка - " + placement.averageRating);
            });
            System.out.println();
        });
        menuActions.mainMenuActions();
    }

    public void bestRating(List<? extends Placements> list) {
        System.out.println(list.stream().max(Comparator.comparingInt(o -> o.averageRating)).get());
        menuActions.mainMenuActions();
    }

    public void printPlacements(List<? extends Placements> list) {
        list.forEach(System.out::println);
        System.out.println();
        menuActions.mainMenuActions();
    }

    public static void deleteAllPlacements() {
        Apartments.apartmentsList = new ArrayList<>();
        CommercialPremises.commercialPremisesList = new ArrayList<>();
        System.out.println("Списки очищены\n");
    }

    public static void printAllPlacements() {
        if (Apartments.apartmentsList.size() > 0) {
            System.out.println("Апартаменты");
            Apartments.apartmentsList.forEach((placement) -> {
                System.out.println("Название - " + placement.name + ", Цена - " + placement.price + ", Оценка - " + placement.averageRating);
            });
        }
        if (CommercialPremises.commercialPremisesList.size() > 0) {
            System.out.println("\nКоммерческая недвижимость");
            CommercialPremises.commercialPremisesList.forEach((placement) -> {
                System.out.println("Название - " + placement.name + ", Цена - " + placement.price + ", Оценка - " + placement.averageRating);
            });
        }
        if (CommercialPremises.commercialPremisesList.size() == 0 & Apartments.apartmentsList.size() == 0){
            System.out.println("Список пустой");
        }
        System.out.println();
    }
}
