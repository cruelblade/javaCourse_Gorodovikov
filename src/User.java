public class User <T>{

    private T id;
    private String name;
    private int age;
    private Account account;

    public User(T id, String name, int age, Account account) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public User(User user) {
        if (user != null) {
            this.id = (T) user.id;
            this.name = user.name;
            this.age = user.age;
            this.account = new Account(user.account);
        }
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        User user = (User) o;
        return this.name.equals(user.name) && this.age == user.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", account=" + account +
                '}';
    }

}
