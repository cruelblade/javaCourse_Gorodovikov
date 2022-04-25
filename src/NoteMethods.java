import java.util.*;

public class NoteMethods extends Methods {
    String noteName;
    String noteBody;
    String noteType;

    public void createNote() {
        System.out.println("Введите название заметки");
        noteName = scanner.nextLine();
        noteBody = scanner.nextLine();
        noteType = scanner.nextLine();
        System.out.println("Заметка создана\n");
    }

    public void searchNote() {
        System.out.printf("%s\n\n%s\n\n%s\n\n", noteName, noteBody, noteType);

    }



    public void actionMenu() {
        System.out.println("Выберите пункт меню:");

        if (currentUser.equals(Users.Administrator) | currentUser.equals(Users.Moderator)) {
            System.out.println("1. Создание новой заметки");
            System.out.println("2. Поиск заметок");
            System.out.println("3. Разлогиниться");

            switch (scanner.nextLine()) {
                case "1":
                    createNote();
                    return;
                case "2":
                    searchNote();
                    return;
                case "3":
                    currentUser = null;
                    break;
                default:
                    System.out.println("Недопустимый ввод!\nВведите корректное значение.\n");
            }
        } else {
            System.out.println("1. Поиск заметок");
            System.out.println("2. Разлогиниться");

            switch (scanner.nextLine()) {
                case "1":
                    searchNote();
                    return;
                case "2":
                    currentUser = null;
                    break;
                default:
                    System.out.println("Недопустимый ввод!\nВведите корректное значение.\n");
            }
        }
    }
}
