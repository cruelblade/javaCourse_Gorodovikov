import java.util.Scanner;
import java.util.function.*;

public class Main {

    public static Person person;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите год рождения студента");
        int birthYear1 = scanner.nextInt();

        Predicate<Integer> predicate = birthYear -> birthYear < 1995;

        Function<Person, Student> convert;

        if(predicate.test(birthYear1)) {
            convert = person -> new Student("11", 11, "УБИН-01-22");
        } else {
            convert = person -> new Student("11", 11, "УБИН-02-22");
        }

        Student student = convert.apply(person);
        System.out.println(student);
    }
}


