public class MenuActions {
    public static void mainMenuActions() {
        Menus.mainMenu();

        switch (Helpers.scanner.nextLine()) {
            case "1" -> apartmentsMenuActions();
            case "2" -> commercialPremisesMenuActions();
            case "5" -> System.exit(0);
            default -> {
                System.out.println("Введите корректное значение\n");
                mainMenuActions();
            }
        }
    }

    public static void apartmentsMenuActions() {
        Menus.apartmentsMenu();

        switch (Helpers.scanner.nextLine()) {
            case "1" -> Apartments.addApartment();
//            case "2" ->
            case "8" -> mainMenuActions();
            default -> {
                System.out.println("Введите корректное значение\n");
                apartmentsMenuActions();
            }
        }
    }

    public static void commercialPremisesMenuActions() {
        Menus.commercialPremisesMenu();

        switch (Helpers.scanner.nextLine()) {
//            case "1" ->
//            case "2" ->
            case "8" -> mainMenuActions();
            default -> {
                System.out.println("Введите корректное значение\n");
                commercialPremisesMenuActions();
            }
        }
    }
}
