public enum Users {
    Administrator("admin","admin"),
    Moderator("master", "1111"),
    User("cru","q123");

    String login;
    String password;

    Users(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
