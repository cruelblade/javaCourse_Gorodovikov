import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("11", 11, "34");
        Function<Student, Person> convert = new Person("11", 11, "34");
    }

}