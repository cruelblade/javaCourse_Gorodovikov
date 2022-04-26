public enum Users {
    Administrator("admin", "admin", "Админов", "Админ"),
    Moderator("master", "1111", "Модераторович", "Модератор"),
    User("cru", "q123", "Просто", "Иван");

    private final String login;
    private final String password;
    private final String surname;
    private final String name;

    private Users(String login, String password, String surname, String name) {
        this.login = login;
        this.password = password;
        this.surname = surname;
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return surname + " " + name ;
    }
}
