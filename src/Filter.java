public interface Filter {
    boolean apply (int age);

    default void printHello(String name) {
        System.out.println("Hello " + name);
    }

    static String getRandomString() {
        return "1234";
    }


}
