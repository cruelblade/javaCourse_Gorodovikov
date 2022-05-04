import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Student student;
    public static TreeSet<Student> students = new TreeSet<>();
    FavouriteSubject favouriteSubject;

    public static void main(String[] args) {
        addedStudents();

        while (true) {
            System.out.println("1. Ввести ученика");
            System.out.println("2. Вывести всех учеников по возрастанию");
            System.out.println("3. Вывести всех учеников по убыванию");
            System.out.println("4. Удалить ученика по индексу");
            System.out.println("5. Выйти из программы");

            switch (scanner.nextLine()) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    showStudentsAsc();
                    break;
                case "3":
                    showStudentsDesc();
                    break;
                case "4":
                    deleteStudent();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Введите корректное значение\n");
                    break;
            }
        }
    }

    public static void addStudent () {
        System.out.println("Введите ФИО ученика");
        String studentFullName = scanner.nextLine();

        System.out.println("Введите возраст ученика");
        String studentAgeStr = scanner.nextLine();
        while (!isNumeric(studentAgeStr)) {
            System.out.println("Введите корректное число");
            studentAgeStr = scanner.nextLine();
        }

        int studentAge = Integer.parseInt(studentAgeStr);

        System.out.println("Введите номер класса ученика");
        String studentClassName = scanner.nextLine();

        System.out.printf("Выберите номер любимого предмета ученика: \n1. %s\n2. %s\n3. %s\n4. %s\n",
                FavouriteSubject.Информатика,
                FavouriteSubject.История,
                FavouriteSubject.Математика,
                FavouriteSubject.Иностранный_язык);

        String subject = scanner.nextLine();


        student = new Student(studentFullName, studentAge, studentClassName, FavouriteSubject.Информатика);

        for (Student s : students) {
            if (s.getFullName().equals(studentFullName) &
                    s.getAge() == studentAge) {
                System.out.println("Ученик уже есть в базе\n");
                return;
            }
        }

        students.add(student);
        System.out.println("Ученик добавлен в базу\n");

    }

    public static void showStudentsAsc() {
        for (Student s : students) {
            System.out.printf("ФИО: %s, возраст: %s, класс: %s, любимый предмет: %s\n", s.fullName, s.age, s.className, s.favouriteSubject);
        }
        System.out.println();
    }

    public static void showStudentsDesc() {
        FullNameAgeComparator fullAgeNameComparator = new FullNameAgeComparator();
        TreeSet<Student> studentsDesc = new TreeSet<>(fullAgeNameComparator);
        studentsDesc.addAll(students);

        for (Student s : studentsDesc) {
            System.out.printf("ФИО: %s, возраст: %s, класс: %s, любимый предмет: %s\n", s.fullName, s.age, s.className, s.favouriteSubject);
        }
        System.out.println();
    }

    public static void deleteStudent() {
        System.out.println("Список учеников для удаления:");
        int studentNumber = 0;
        for (Student s : students) {
            studentNumber++;
            System.out.printf("%d. ФИО: %s, возраст: %s, класс: %s\n", studentNumber, s.fullName, s.age, s.className);
        }
        System.out.println("\nВведите номер ученика для удаления");

        String indexStr = scanner.nextLine();
        while (!isNumeric(indexStr)) {
            System.out.println("Введите корректное число");
            indexStr = scanner.nextLine();
        }
        int index = Integer.parseInt(indexStr);
        if (index > students.size() | index < 1) {
            System.out.println("Ученик не существует\n");
            return;
        }

        int i = 0;
        for (Student s : students) {
            i++;
            if (index == i) {
                students.remove(s);
                System.out.println("Ученик \""+ s.fullName + "\" удален\n");
                break;
            }
        }
    }

    public static void addedStudents() {
        student = new Student("Студень Иван Петрович", 7, "1b", FavouriteSubject.Информатика);
        students.add(student);
        student = new Student("Горелый Реван Альбертович", 14, "8a", FavouriteSubject.Математика);
        students.add(student);
        student = new Student("Газазикян Армен Вагинарович", 9, "3b", FavouriteSubject.Иностранный_язык);
        students.add(student);
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
