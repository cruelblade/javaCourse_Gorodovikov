import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.function.*;

public class Main {

    public static Person person;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите год рождения студента");
        int birthYear1 = scanner.nextInt();

        LocalDate current_date = LocalDate.now();
        int age1 = current_date.getYear() - birthYear1;

        Predicate<Integer> predicateAge = age -> age >= 17 & age <= 40;

        if (!predicateAge.test(age1)) {
            System.out.println("Возраст студента должен быть от 17 до 40");
            System.exit(0);
        }

        Predicate<Integer> predicateBirthYear = birthYear -> birthYear < 1995;

        Function<Person, Student> convert;

        if (predicateBirthYear.test(birthYear1)) {
            convert = person -> new Student("11", 11, "УбИН-01-22");
        } else {
            convert = person -> new Student("11", 11, "УбИН-02-22");
        }

        Student student = convert.apply(person);
        System.out.println(student);
    }
}


