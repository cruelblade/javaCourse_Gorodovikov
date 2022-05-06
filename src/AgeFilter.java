public interface AgeFilter {

    boolean apply(int age);

//    void print();

    default void printHello(String name) {
        System.out.println("Hello" + name);
    }

    static String getRandomString() {
        return "1234";
    }


}
