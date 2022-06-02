import java.util.ArrayList;
import java.util.List;

public class Apartments extends Placements {

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

    public Apartments() { }

    @Override
    public void addPlacement() {
        super.addPlacement();
        apartmentsList.add(new Apartments(
                name,
                address,
                metroStation,
                roomCount,
                footage,
                price,
                averageRating));

        System.out.println("Апартаменты добавлены\n");
        menuActions.apartmentsMenuActions();
    }



    @Override
    public String toString() {

        return "Апартаменты: " +
                "название '" + name + '\'' +
                ", адрес '" + address + '\'' +
                ", метро '" + metroStation + '\'' +
                ", кол-во комнат " + roomCount +
                ", метраж " + footage +
                ", цена " + price +
                ", средняя оценка " + averageRating +
                '.';
    }
}
