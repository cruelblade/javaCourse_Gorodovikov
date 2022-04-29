
public class Main {
    public static final AuthorizationMethods authorizationMethods = new AuthorizationMethods();
    public static final NoteMethods noteMethods = new NoteMethods();

    public static void main(String[] args) {
        noteMethods.createdNotesByHardCode(); //заметки, созданные хардкодом, при необходимости можно удалить
        while (true) {
            authorizationMethods.actionMenu();
            noteMethods.actionMenu();
        }
    }
}
