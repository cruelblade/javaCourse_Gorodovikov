import java.util.ArrayList;

public class MenuActions extends Menus {
    static Placements apartments = new Apartments();
    static Placements commercialPremises = new CommercialPremises();

    public void mainMenuActions() {
        printMainMenu();

        switch (Helpers.scanner.nextLine()) {
            case "1" -> apartmentsMenuActions();
            case "2" -> commercialPremisesMenuActions();
            case "3" -> {
                Placements.deleteAllPlacements();
                mainMenuActions();
            }
            case "4" -> {
                Placements.printAllPlacements();
                mainMenuActions();
            }
            case "5" -> System.exit(0);
            default -> {
                System.out.println("Введите корректное значение\n");
                mainMenuActions();
            }
        }
    }

    public void apartmentsMenuActions() {
        printApartmentsMenu();

        switch (Helpers.scanner.nextLine()) {
            case "1" -> apartments.addPlacement();
            case "2" -> apartments.deletePlacement(Apartments.apartmentsList);
            case "3" -> apartments.sortByPriceAsc(Apartments.apartmentsList);
            case "4" -> apartments.sortByPriceDesc(Apartments.apartmentsList);
            case "5" -> apartments.metroGroup(Apartments.apartmentsList);
            case "6" -> apartments.bestRating(Apartments.apartmentsList);
            case "7" -> apartments.printPlacements(Apartments.apartmentsList);
            case "8" -> mainMenuActions();
            default -> {
                System.out.println("Введите корректное значение\n");
                apartmentsMenuActions();
            }
        }
    }

    public void commercialPremisesMenuActions() {
        printCommercialPremisesMenu();

        switch (Helpers.scanner.nextLine()) {
            case "1" -> commercialPremises.addPlacement();
            case "2" -> commercialPremises.deletePlacement(CommercialPremises.commercialPremisesList);
            case "3" -> commercialPremises.sortByPriceAsc(CommercialPremises.commercialPremisesList);
            case "4" -> commercialPremises.sortByPriceDesc(CommercialPremises.commercialPremisesList);
            case "5" -> commercialPremises.metroGroup(CommercialPremises.commercialPremisesList);
            case "6" -> commercialPremises.bestRating(CommercialPremises.commercialPremisesList);
            case "7" -> commercialPremises.printPlacements(CommercialPremises.commercialPremisesList);
            case "8" -> mainMenuActions();
            default -> {
                System.out.println("Введите корректное значение\n");
                commercialPremisesMenuActions();
            }
        }
    }
}
