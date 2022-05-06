import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//        Operation<Integer> sum = getOperation("+");
//        Operation<Integer> minus = getOperation("-");
//        Operation<Integer> multiply = getOperation("*");

        User user = new User("Masf", 33);
        Predicate<Integer> p = age -> age > 22;
        Predicate<String> p2 = name -> name.contains("M");
        System.out.println(p.test(user.age));
        System.out.println(p2.test(user.getName()));

        Function<Integer, String> f = String::valueOf;
        String s = f.apply(23);
        System.out.println(s);

        Consumer<User> c = user2 -> {
            user2.age++;
        };
        c.accept(user);
        System.out.println(user.age);

//        Test t = () -> user.age * user.age;
//        Test nt = user::doubleAge;
//
//        System.out.println(nt.doSmth());
//
//        System.out.println(sum.execute(1, 3));
//        System.out.println(minus.execute(3, 4));
//        System.out.println(multiply.execute(1, 4));

    }

    private static Operation<Integer> getOperation(String choice) {
        switch (choice) {
            case "+": return Integer::sum;
            case "-": return (x, y) -> x - y;
            default: return (x, y) -> 0;
        }
    }
}

interface Operation<T> {
    T execute(T first, T second);
}

interface Test {
    Integer doSmth();
}


//public class Main {
//
//    public static User user;
//
//    static AgeFilter ag = (age) -> age >= 18;
//
//    public static void main(String[] args) {
//
//
//        InterfaceSomething<User, User2> ifs = user
//                -> new User2(user.getName(), String.valueOf(user.age));
//
//        printUser2(ifs);
//
////        InterfaceSomething <Integer, String> ifs2 = String::valueOf;
////
////        String s = ifs2.doSomething(23);
////        System.out.println(s);
//
//
//
////        User2 u = ifs.doSomething(new User("MAX", 23));
////        System.out.println(u.age + "\n" + u.name);
//
//
//
//
////часть 2
////        user = new User("MAX", 23);
////
////        System.out.println(user.getName() + ": " + user.age);
////
////        AtomicReference<Integer> a = new AtomicReference<>(0);
////
////        AgeFilter ag = age -> {
////          user. setName("IVAN");
////            if (age >= 18)
////                a.set(user.age);
////          user.age = 24;
////          return !(age < 18);
////        };
//
////        System.out.println(ag.apply(user.age) + "\n" + user.age + "\n" + user.getName());
//
////часть 1
////        Printable inst = (name) -> System.out.println("Hello world!" + name);
////
////        inst.print("хрень");
////
//////        Comparator<Integer> c = (firstNum, secondNum) -> firstNum - secondNum;
////
////
////        AgeFilter af = age -> !(age < 18);
////
////        Scanner scr = new Scanner(System.in);
////        int age = scr.nextInt();
////
////        if (af.apply(age))
////            System.out.println("ADULT");
////        else System.out.println("KID");
////
////        af.printHello("Max");
////        System.out.println(AgeFilter.getRandomString());
//
//    }
//
//копия класса - 51 минута
//    public static void printUser2(InterfaceSomething<User, User2> ifs) {
//        User2 u = ifs.doSomething(new User("MAX", 23));
//        System.out.println(u.age + "\n" + u.name);
//    }
//}
//
//
//interface InterfaceSomething <T, R> {
//    R doSomething(T object);
//}
