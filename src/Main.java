import java.util.Scanner;

public class Main {
    public static final AuthorizationMethods authorizationMethods = new AuthorizationMethods();
    public static final NoteMethods noteMethods = new NoteMethods();

    public static void main(String[] args) {
        while (true) {
            authorizationMethods.actionMenu();
            noteMethods.actionMenu();
        }
    }
}
