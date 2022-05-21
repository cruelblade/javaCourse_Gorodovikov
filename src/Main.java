import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> arrayList = new ArrayList<>(Arrays.asList(
                new Person("Ben", 53), new Person("Mei", 58), new Person("Peter", 17), new Person("Mary", 17)));

        //сортировка по возрастанию
        arrayList.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
        System.out.println();

        //сортировка по убыванию
        arrayList.stream().sorted(Comparator.comparing(Person::getAge).reversed()).forEach(System.out::println);
        System.out.println();

        //фильтрация по полю
        arrayList.stream().filter(s -> s.getAge() < 18).forEach(System.out::println);
        System.out.println();

        //группировка
        Map <Integer, List<Person>> groupingByAge =
                arrayList.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.groupingBy(Person::getAge));

        groupingByAge.forEach((age, person) -> {
            System.out.print("Age: " + age);
            person.forEach(e -> System.out.print("; " + e));
            System.out.println();
        });
        System.out.println();

        //минимальный объект
        arrayList.stream().min(Comparator.comparing(Person::getAge).thenComparing(Person::getName)).ifPresent(System.out::println);
        System.out.println();

        //максимальный объект
        arrayList.stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);
        System.out.println();

        //allMatch
        if (arrayList.stream().allMatch(e -> e.getAge() > 16))
            System.out.println("Всем больше 16");
        System.out.println();

        //anyMatch
        if(arrayList.stream().anyMatch(e -> e.getName().equals("Peter")))
            System.out.println("Там есть Петр");
        System.out.println();

        //noneMatch
        if(arrayList.stream().noneMatch(e -> e.getName().equals("Ivan")))
            System.out.println("Ивана тут нет");
        System.out.println();


    }


}