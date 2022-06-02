import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static MenuActions menuActions = new MenuActions();

    public static void main(String[] args) {
        Helpers.addedPlacements();
        menuActions.mainMenuActions();
    }
}