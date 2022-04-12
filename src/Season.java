import java.awt.*;


public enum Season {
    Winter("Зима", "Белый"),
    Spring("Весна", "Серый"),
    Summer("Лето", "Желтый"),
    Autumn("Осень", "Оранжевый");


    private final String seasonColor;
    private final String seasonName;

    Season(String seasonName, String color) {
        this.seasonColor = color;
        this.seasonName = seasonName;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonColor() {
        return seasonColor;
    }
}
