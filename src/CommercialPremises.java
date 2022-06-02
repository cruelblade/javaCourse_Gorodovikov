import java.util.ArrayList;
import java.util.List;

public class CommercialPremises extends Placements{

    static List<CommercialPremises> commercialPremisesList = new ArrayList<>();

    public CommercialPremises(String name, String address, String metroStation, String type, int footage, int price, int averageRating) {
        this.name = name;
        this.address = address;
        this.metroStation = metroStation;
        this.type = type;
        this.footage = footage;
        this.price = price;
        this.averageRating = averageRating;
    }

    public CommercialPremises() { }

    @Override
    public void addPlacement() {
        super.addPlacement();
        commercialPremisesList.add(new CommercialPremises(
                name,
                address,
                metroStation,
                type,
                footage,
                price,
                averageRating));

        System.out.println("Коммерческое помещение добавлено\n");
        menuActions.commercialPremisesMenuActions();
    }

    @Override
    public String toString() {

        return "Комерческое помещение: " +
                "название '" + name + '\'' +
                ", адрес '" + address + '\'' +
                ", метро '" + metroStation + '\'' +
                ", тип '" + type + '\'' +
                ", метраж " + footage +
                ", цена " + price +
                ", средняя оценка" + averageRating +
                '.';
    }
}
