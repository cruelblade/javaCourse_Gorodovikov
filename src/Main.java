import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Person> people = setList();

//        System.out.println(people.stream().allMatch(person -> !person.getName().equals("ROMAN")));
//        System.out.println(people.stream().anyMatch(person -> person.getAge().equals(22)));
//        System.out.println(people.stream().noneMatch(person -> person.getName().equals("Ivan")));

        System.out.println(people.stream().reduce(0, (a, b) -> {
            if (b.getAge() >= 18)
                return a + b.getAge();
            else
                return a;
        }, Integer::sum));



        //разбор optional и comparator (дальнейший с ifPresent разбор ~ на 50 минуте)
//        PersonComparator pc = new PersonComparator();

//        Map<Integer, List<Person>> groupingByAge =
//                people.stream().sorted(Comparator.comparing(Person::getName)).
//                        collect(Collectors.groupingBy(Person::getAge));
//
//        groupingByAge.forEach((age, person) -> {
//            System.out.print("Age: " + age);
//            person.forEach(e -> System.out.print("; " + e));
//            System.out.println();
//        });
//        System.out.println();
//
//        Optional<List<Person>> listOptional = Optional.ofNullable(null);
//        List<Person> list = listOptional.orElse(setList());
//        list.forEach(System.out::println);
    }

    private static List<Person> setList() {
        return Arrays.asList(new Person("Max", 12),
                new Person("Anton", 22),
                new Person("Ivan", 24),
                new Person("Alexey", 16));
    }

}

//class PersonComparator implements Comparator<Person> {
//
//    @Override
//    public int compare(Person o1, Person o2) {
//        return o1.getAge().compareTo(o2.getAge());
//    }
//}