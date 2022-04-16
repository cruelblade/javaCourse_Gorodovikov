public class Main {

    public static void main(String[] args) {
        Account account = new Account("Max1", "asd123");


        User<Integer> user = new User<>(13, "Max", 23, account);

        Consumer<User<Integer>> consumer = new Consumer<>("3", "asdf");

        consumer.user = user;
        consumer.user = new SubUser<>(13, "Max", 23, account);

        System.out.println(print(user));


    }

    private static <T> String print(T obj) {
        return obj.toString();
    }
}
