import java.util.*;

public class AuthorizationMethods extends Methods {
    private final Users[] users = Users.values();

    public void authorization() {
        while (true) {
            System.out.print("логин: ");
            String login = scanner.nextLine();
            System.out.print("пароль: ");
            String password = scanner.nextLine();

            for (Users user : users) {
                if (login.toLowerCase().equals(user.getLogin())) {
                    if (password.equals(user.getPassword())) {
                        System.out.println("Авторизация прошла успешно");
                        currentUser = user;
                        System.out.printf("Приветствуем вас, %s\n\n", currentUser);
                    } else {
                        System.out.println("Неверный пароль!\n");
                    }
                    return;
                }
            }

            System.out.println("Логин неверный!\n");
            return;
        }
    }

    public void actionMenu() {
        while (currentUser == null) {
            System.out.println("1. Авторизоваться");
            System.out.println("2. Выйти");

            switch (scanner.nextLine()) {
                case "1":
                    authorization();
                    break;
                case "2":
                    System.exit(0);
                default:
                    System.out.println("Недопустимый ввод!\nВведите корректное значение.\n");
            }
        }
    }
}
