import java.util.ArrayList;
import java.util.List;

public class CommercialPremises {
    String name;
    String address;
    String metroStation;
    String type;
    String footage;
    String price;
    String averageRating;
    List<CommercialPremises> commercialPremisesList = new ArrayList<>();

    public CommercialPremises(String name, String address, String metroStation, String type, String footage, String price, String averageRating) {
        this.name = name;
        this.address = address;
        this.metroStation = metroStation;
        this.type = type;
        this.footage = footage;
        this.price = price;
        this.averageRating = averageRating;
    }
}
